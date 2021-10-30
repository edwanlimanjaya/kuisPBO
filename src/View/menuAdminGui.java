package View;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
public class menuAdminGui {
    
    public void guiRegister(){
        JFrame frameRegistrasi = new JFrame(" Formulir Pendaftaran Kasir");
        frameRegistrasi.setSize(1000, 500);
        frameRegistrasi.setVisible(true);
        frameRegistrasi.setLayout(null);
        frameRegistrasi.setLocationRelativeTo(null);
        
        JLabel labelNama = new JLabel("Nama");
        labelNama.setBounds(10, 5, 50, 20);
        JLabel labelTempatTanggalLahir = new JLabel("Tempat dan Tanggal Lahir");
        labelTempatTanggalLahir.setBounds(10, 25, 200, 20);
        JLabel labelNomorTelepon = new JLabel("Nomor Telepon");
        labelNomorTelepon.setBounds(10, 45, 100, 20);
        JLabel labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(10, 65, 55, 20);
        
        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(45, 5, 200, 20);
        JTextField textFieldTempatLahir = new JTextField();
        textFieldTempatLahir.setBounds(160, 25, 100, 20);
        JTextField textFieldNomorTelepon = new JTextField();
        textFieldNomorTelepon.setBounds(100, 45, 100, 20);
        JTextField textFieldAlamat = new JTextField();
        textFieldAlamat.setBounds(55,65,200,20);
        
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePickerTanggalLahir = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePickerTanggalLahir.setBounds(280, 25, 200, 50);
        
        
        frameRegistrasi.add(labelNama);
        frameRegistrasi.add(labelTempatTanggalLahir);
        frameRegistrasi.add(labelNomorTelepon);
        frameRegistrasi.add(labelAlamat);
        
        frameRegistrasi.add(textFieldNama);
        frameRegistrasi.add(textFieldTempatLahir);
        frameRegistrasi.add(datePickerTanggalLahir);
        frameRegistrasi.add(textFieldNomorTelepon);
        frameRegistrasi.add(textFieldAlamat);
    }
}
