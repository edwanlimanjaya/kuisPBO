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
public class MenuDataBarangDiskon implements ActionListener{
    private int menu;
    private JButton updateBarangDiskon;
    private JButton tambahBarangDiskon;
    private JButton cancel;
    private JFrame frame;
    
    public MenuDataBarangDiskon(){
        
    }
    private void TampilanMenuDataBarangDiskon(){
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu data barang"
                    + "\n1. Update barang"
                    + "\n2. Delete barang"
                    + "\n3. Menampilkan List Barang"
                    + "\n3. Exit"));
            switch (menu) {
                case 1:
                    MenuUpdateBarangDiskon();
                    break;
                case 2:
                    new DeleteBarang();
                    break;
                case 3:
                    
                    break;
                case 4:
                    new MenuAdmin();
                    break;
                default:
                    new PesanJOption.PesanGagalJOption().PesanMenuTidakDitemukan();
            }
        } while (menu>3);
        
    }
    
    private void MenuUpdateBarangDiskon(){
        String title = ("Update barang");
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(600, 200);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Content();
        InsertToFrame();
        tambahBarangDiskon.addActionListener(this);
        updateBarangDiskon.addActionListener(this);
        cancel.addActionListener(this);
    }
    
    private void Content(){
        tambahBarangDiskon = new JButton("Tambah barang");
        tambahBarangDiskon.setBounds(20, 120, 150, 20);
        updateBarangDiskon = new JButton("Update barang");
        updateBarangDiskon.setBounds(250,120, 150, 20);
        cancel = new JButton("Cancel");
        cancel.setBounds(450,120,100,20);
    }
    
    private void InsertToFrame(){
        frame.add(tambahBarangDiskon);
        frame.add(updateBarangDiskon);
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
                TampilanMenuDataBarangDiskon();
                break;
        }
    }
}
