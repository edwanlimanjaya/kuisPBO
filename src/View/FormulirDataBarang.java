/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author HP
 */
public class FormulirDataBarang {
    private JFrame frame;
    private JLabel labelKodeBarang;
    private JLabel labelNamaBarang;
    private JLabel labelKategori;
    private JLabel labelStok;
    private JLabel labelHargaBarang;
    private JLabel labelKadaluarsa;
    private JLabel labelPersenDiskon;
    private JTextField fieldKodeBarang;
    private JTextField fieldNamaBarang;
    private JTextField fieldKategori;
    private JTextField fieldStock;
    private JTextField filedHargaBarang;
    private JTextField fieldKadaluarsa;
    private JTextField fieldPersenDiskon;
    
    public FormulirDataBarang(){
        String title = "Data Barang";
        frame.setTitle(title);
        frame.setSize(500,200);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        Labels();
    }
    
    public void Labels(){
        labelKodeBarang = new JLabel("Kode Barang");
        labelKodeBarang.setBounds(10, 5, 100, 20);
        labelNamaBarang = new JLabel("Nama Barang");
        labelNamaBarang.setBounds(10, 35, 100, 20);
        labelKategori = new JLabel("Kategori");
        labelKategori.setBounds(10, 65, 100, 20);
        labelStok = new JLabel("Stok");
        labelStok.setBounds(10, 95, 100, 20);
        labelHargaBarang = new JLabel("Harga barang");
        labelHargaBarang.setBounds(10, 125, 100, 20);
        labelKadaluarsa = new JLabel("Tanggal kadaluarsa");
        labelKadaluarsa.setBounds(10, 155, 100, 20);
        labelPersenDiskon = new JLabel("Persen diskon");
        labelPersenDiskon.setBounds(10, 185, 100, 20);
    }
    
    public void Content(){
        
    }
    
    public void InsertToFrame(){
        frame.add(labelKodeBarang);
        frame.add(labelNamaBarang);
        frame.add(labelKategori);
        frame.add(labelStok);
        frame.add(labelHargaBarang);
        frame.add(labelKadaluarsa);
        frame.add(labelPersenDiskon);
    }
}
