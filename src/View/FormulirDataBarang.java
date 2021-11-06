/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
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
    private JSpinner stok;
    private JTextField fieldHargaBarang;
    private JDatePickerImpl datePickerTanggalKadaluarsa;
    private JTextField fieldPersenDiskon;
    private JButton buttonMasukan;
    private JButton buttonMembatalkan;
    
    public FormulirDataBarang(){
        String title = "Data Barang";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        Labels();
        Content();
        buttonMasukan = new JButton("Masukan");
        buttonMasukan.setBounds(200, 300, 100, 20);
        buttonMembatalkan = new JButton("Membatalkan");
        buttonMembatalkan.setBounds(300, 300, 150, 20);
        InsertToFrame();
    }
    
    private void Labels(){
        labelKodeBarang = new JLabel("Kode Barang");
        labelKodeBarang.setBounds(10, 5, 100, 20);
        labelNamaBarang = new JLabel("Nama Barang");
        labelNamaBarang.setBounds(10, 45, 100, 20);
        labelKategori = new JLabel("Kategori");
        labelKategori.setBounds(10, 85, 100, 20);
        labelStok = new JLabel("Stok");
        labelStok.setBounds(10, 125, 100, 20);
        labelHargaBarang = new JLabel("Harga barang");
        labelHargaBarang.setBounds(10, 165, 100, 20);
        labelKadaluarsa = new JLabel("Tanggal kadaluarsa");
        labelKadaluarsa.setBounds(10, 205, 150, 20);
        labelPersenDiskon = new JLabel("Persen Diskon");
        labelPersenDiskon.setBounds(10, 245, 150, 20);
    }
    
    private void Content(){
        fieldKodeBarang = new JTextField();
        fieldKodeBarang.setBounds(110, 5, 100, 20);
        fieldNamaBarang = new JTextField();
        fieldNamaBarang.setBounds(110, 45, 100, 20);
        fieldKategori = new JTextField();
        fieldKategori.setBounds(100, 85, 100, 20);
        stok = new JSpinner();
        stok.setBounds(110, 125, 100, 20);
        fieldHargaBarang = new JTextField();
        fieldHargaBarang.setBounds(110, 165, 100, 20);
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePickerTanggalKadaluarsa = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePickerTanggalKadaluarsa.setBounds(160, 205, 200, 50);
        fieldPersenDiskon = new JTextField();
        fieldPersenDiskon.setBounds(160, 255, 100, 20);
    }
    
    private void InsertToFrame(){
        frame.add(labelKodeBarang);
        frame.add(labelNamaBarang);
        frame.add(labelKategori);
        frame.add(labelStok);
        frame.add(labelHargaBarang);
        frame.add(labelKadaluarsa);
        frame.add(labelPersenDiskon);
        frame.add(fieldKodeBarang);
        frame.add(fieldNamaBarang);
        frame.add(fieldKategori);
        frame.add(stok);
        frame.add(fieldHargaBarang);
        frame.add(datePickerTanggalKadaluarsa);
        frame.add(fieldPersenDiskon);
        frame.add(buttonMasukan);
        frame.add(buttonMembatalkan);
    }
}
