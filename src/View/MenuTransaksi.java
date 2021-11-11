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
import javax.swing.JSpinner;
import javax.swing.JButton;
/**
 *
 * @author HP
 */
public class MenuTransaksi implements ActionListener{
    private JFrame frame;
    private JLabel labelKodeBarang;
    private JLabel labelJumlahBarang;
    private JButton tambahBarang;
    private JButton tidak;
    private JTextField fieldKodeBarang;
    private JSpinner jumlahBarang;
    
    public MenuTransaksi(){
        String title = "Input Transaksi";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(350,190);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        
        tambahBarang = new JButton("Tambah Barang");
        tambahBarang.setBounds(60,100,150,20);
        tidak = new JButton("Tidak");
        tidak.setBounds(220,100,100,20);
        
        Labels();
        Content();
        InsertToFrame();
        
        tambahBarang.addActionListener(this);
        tidak.addActionListener(this);
    }
    
    private void Labels(){
        labelKodeBarang = new JLabel("Kode barang");
        labelKodeBarang.setBounds(10,10,100,20);
        labelJumlahBarang = new JLabel("Jumlah");
        labelJumlahBarang.setBounds(10, 50, 100, 20);
    }
    
    private void Content(){
        fieldKodeBarang = new JTextField();
        fieldKodeBarang.setBounds(110, 10, 100, 20);
        jumlahBarang = new JSpinner();
        jumlahBarang.setBounds(110, 50, 100, 20);
    }
    
    private void InsertToFrame(){
        frame.add(labelKodeBarang);
        frame.add(labelJumlahBarang);
        frame.add(fieldKodeBarang);
        frame.add(jumlahBarang);
        frame.add(tambahBarang);
        frame.add(tidak);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "Tambah Barang":
                new MenuTransaksi();
                break;
            case "Tidak":
                new MenuBayar();
                break;
            default:
                throw new AssertionError();
        }
    }
}
