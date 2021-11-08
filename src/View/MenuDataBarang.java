/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author HP
 */
public class MenuDataBarang implements ActionListener{
    private int menu;
    private JButton updateBarang;
    private JButton tambahBarang;
    private JButton cancel;
    private JFrame frame;
    
    public MenuDataBarang(){
        TampilanMenuDataBarang();
    }
    
    private void TampilanMenuDataBarang(){
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu data barang"
                    + "\n1. Update barang"
                    + "\n2. Delete barang"
                    + "\n3. Exit"));
            switch (menu) {
                case 1:
                    MenuUpdateBarang();
                    break;
                case 2:
                    
                    break;
                case 3:
                    new MenuAdmin();
                    break;
                default:
                    new PesanJOption.PesanGagal().PesanMenuTidakDitemukan();
            }
        } while (menu>3);
        
    }
    
    private void MenuUpdateBarang(){
        String title = ("Update barang");
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(600, 200);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Content();
        InsertToFrame();
        tambahBarang.addActionListener(this);
        updateBarang.addActionListener(this);
        cancel.addActionListener(this);
    }
    
    private void Content(){
        tambahBarang = new JButton("Tambah barang");
        tambahBarang.setBounds(20, 120, 150, 20);
        updateBarang = new JButton("Update barang");
        updateBarang.setBounds(250,120, 150, 20);
        cancel = new JButton("Cancel");
        cancel.setBounds(450,120,100,20);
    }
    
    private void InsertToFrame(){
        frame.add(tambahBarang);
        frame.add(updateBarang);
        frame.add(cancel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "Tambah barang":
                new FormulirDataBarang();
                break;
            case "Update barang":
                new FormulirUpdateBarang();
                break;
            case "Cancel":
                TampilanMenuDataBarang();
                break;
        }
    }
}
