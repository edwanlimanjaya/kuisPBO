/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.util.Properties;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePickerImpl;
import javax.swing.JSpinner;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;
/**
 *
 * @author HP
 */
public class FormulirPenjualanBarang {
    private JFrame frame;
    private JLabel labelNomorFaktur;
    private JLabel labelTotalPenjualan;
    private JLabel labelJenisPembayaran;
    private JLabel labelKodeBarang;
    private JLabel labelTanggalJual;
    private JLabel labelKuantitas;
    private JButton memasukan;
    private JButton membatalkan;
    private JTextField fieldNomorFaktur;
    private JTextField fieldTotalPenjualan;
    private JTextField fieldJenisPembayaran;
    private JTextField fieldKodeBarang;
    private JDatePickerImpl datePickerTanggalJual;
    private JSpinner kuantitas;
    
    public FormulirPenjualanBarang(){
        String title = "Formulir Penjualan Barang";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(700,320);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Labels();
        memasukan = new JButton("Memasukan");
        memasukan.setBounds(300, 250, 150, 20);
        membatalkan = new JButton("Membatalkan");
        membatalkan.setBounds(450, 250, 150, 20);
        Content();
        InsertToFrame();
    }
    
    public void Labels(){
        labelNomorFaktur = new JLabel("Nomor faktur");
        labelNomorFaktur.setBounds(10, 10, 100, 20);
        labelTotalPenjualan = new JLabel("Total penjualan");
        labelTotalPenjualan.setBounds(10, 50, 100, 20);
        labelJenisPembayaran = new JLabel("Jenis pembayaran");
        labelJenisPembayaran.setBounds(10, 90, 150, 20);
        labelKodeBarang = new JLabel("Kode barang");
        labelKodeBarang.setBounds(10, 130, 100, 20);
        labelTanggalJual = new JLabel("Tanggal jual");
        labelTanggalJual.setBounds(10, 170, 100, 20);
        labelKuantitas = new JLabel("Kuantitas");
        labelKuantitas.setBounds(10, 230, 100, 20);
    }
    
    public void Content(){
        fieldNomorFaktur = new JTextField();
        fieldNomorFaktur.setBounds(110, 10, 100, 20);
        fieldTotalPenjualan = new JTextField();
        fieldTotalPenjualan.setBounds(110, 50, 100, 20);
        fieldJenisPembayaran = new JTextField();
        fieldJenisPembayaran.setBounds(160, 90, 100, 20);
        fieldKodeBarang = new JTextField();
        fieldKodeBarang.setBounds(110, 130, 100, 20);
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePickerTanggalJual = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePickerTanggalJual.setBounds(110, 170, 200, 50);
        kuantitas = new JSpinner();
        kuantitas.setBounds(110, 230, 100, 20);
    }
    
    public void InsertToFrame(){
        frame.add(labelNomorFaktur);
        frame.add(labelTotalPenjualan);
        frame.add(labelJenisPembayaran);
        frame.add(labelKodeBarang);
        frame.add(labelTanggalJual);
        frame.add(labelKuantitas);
        frame.add(memasukan);
        frame.add(membatalkan);
        frame.add(fieldNomorFaktur);
        frame.add(fieldTotalPenjualan);
        frame.add(fieldJenisPembayaran);
        frame.add(fieldKodeBarang);
        frame.add(datePickerTanggalJual);
        frame.add(kuantitas);
    }
}
