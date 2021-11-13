/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
/**
 *
 * @author HP
 */
public class MenuDataTopUp implements ActionListener{
    private int menu;
    private JButton updateTopUp;
    private JButton tambahTopUp;
    private JButton cancel;
    private JFrame frame;
    
    public MenuDataTopUp(){
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu data top up"
                    +"List Top Up"
                    + "\n"
                    + "\n1. Update barang"
                    + "\n2. Delete barang"
                    + "\n3. Exit"));
            switch (menu) {
                case 1:
                    TampilanMenuDataTopUp();
                    break;
                case 2:
                    new DeleteTopUp();
                    break;
                case 3:
                    new MenuAdmin();
                    break;
                default:
                    new PesanJOption.PesanGagalJOption().PesanMenuTidakDitemukan();
            }
        } while (menu>3);
    }
    
    private void TampilanMenuDataTopUp(){
        String title = ("Update Top Up");
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(600, 200);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Labels();
        InsertToFrame();
        tambahTopUp.addActionListener(this);
        updateTopUp.addActionListener(this);
        cancel.addActionListener(this);
    }
    
    private void Labels(){
        tambahTopUp = new JButton("Tambah top up");
        tambahTopUp.setBounds(20, 120, 150, 20);
        updateTopUp = new JButton("Update top up");
        updateTopUp.setBounds(250,120, 150, 20);
        cancel = new JButton("Cancel");
        cancel.setBounds(450,120,100,20);
    }
    
    private void InsertToFrame(){
        frame.add(tambahTopUp);
        frame.add(updateTopUp);
        frame.add(cancel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "Tambah top up":
                new FormulirTopUp();
                break;
            case "Update top up":
                new FormulirUpdateTopUp();
                break;
            case "Cancel":
                TampilanMenuDataTopUp();
                break;
        }
    }
}
