package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class FormulirRegistrasiKasir implements ActionListener {

    private JFrame frameRegistrasi;
    private JLabel labelNama;
    private JLabel labelTempatTanggalLahir;
    private JLabel labelNomorTelepon;
    private JLabel labelAlamat;
    private JLabel labelIdPerson;
    private JLabel labelJabatan;
    private JLabel labelPassword;
    private JTextField textFieldNama;
    private JTextField textFieldTempatLahir;
    private JTextField textFieldNomorTelepon;
    private JTextField textFieldAlamat;
    private JTextField textFieldIdPerson;
    private JTextField textFieldJabatan;
    private JPasswordField passwordFieldPassword;
    private JDatePickerImpl datePickerTanggalLahir;
    private JButton buttonSubmit;

    public FormulirRegistrasiKasir(){
        tampilanMenuRegister();
    }
    private void tampilanMenuRegister() {
        frameRegistrasi = new JFrame(" Formulir Pendaftaran Kasir");
        frameRegistrasi.setSize(600, 300);
        frameRegistrasi.setVisible(true);
        frameRegistrasi.setLayout(null);
        frameRegistrasi.setLocationRelativeTo(null);

        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(400, 225, 100, 20);

        Labels();
        Contents();
        MasukanKeFrameRegistrasi();

        buttonSubmit.addActionListener(this);
    }

    private void Labels() {
        labelNama = new JLabel("Nama");
        labelNama.setBounds(10, 5, 50, 20);
        labelTempatTanggalLahir = new JLabel("Tempat dan Tanggal Lahir");
        labelTempatTanggalLahir.setBounds(10, 35, 200, 20);
        labelNomorTelepon = new JLabel("Nomor Telepon");
        labelNomorTelepon.setBounds(10, 65, 100, 20);
        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(10, 95, 55, 20);
        labelIdPerson = new JLabel("Id Person");
        labelIdPerson.setBounds(10, 125, 100, 20);
        labelJabatan = new JLabel("Jabatan");
        labelJabatan.setBounds(10, 155, 100, 20);
        labelPassword = new JLabel("Password");
        labelPassword.setBounds(10, 185, 100, 20);
    }

    private void Contents() {
        textFieldNama = new JTextField();
        textFieldNama.setBounds(65, 5, 200, 20);
        textFieldTempatLahir = new JTextField();
        textFieldTempatLahir.setBounds(180, 35, 100, 20);
        textFieldNomorTelepon = new JTextField();
        textFieldNomorTelepon.setBounds(110, 65, 100, 20);
        textFieldAlamat = new JTextField();
        textFieldAlamat.setBounds(65, 95, 200, 20);
        textFieldIdPerson = new JTextField();
        textFieldIdPerson.setBounds(110, 125, 100, 20);
        textFieldJabatan = new JTextField("Kasir");
        textFieldJabatan.setBounds(110, 155, 100, 20);
        passwordFieldPassword = new JPasswordField();
        passwordFieldPassword.setBounds(110, 185, 100, 20);
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePickerTanggalLahir = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePickerTanggalLahir.setBounds(280, 35, 200, 50);
    }

    private void MasukanKeFrameRegistrasi() {
        frameRegistrasi.add(labelNama);
        frameRegistrasi.add(labelTempatTanggalLahir);
        frameRegistrasi.add(labelNomorTelepon);
        frameRegistrasi.add(labelAlamat);
        frameRegistrasi.add(labelIdPerson);
        frameRegistrasi.add(labelJabatan);
        frameRegistrasi.add(labelPassword);
        frameRegistrasi.add(textFieldNama);
        frameRegistrasi.add(textFieldTempatLahir);
        frameRegistrasi.add(datePickerTanggalLahir);
        frameRegistrasi.add(textFieldNomorTelepon);
        frameRegistrasi.add(textFieldAlamat);
        frameRegistrasi.add(textFieldIdPerson);
        frameRegistrasi.add(textFieldJabatan);
        frameRegistrasi.add(passwordFieldPassword);
        frameRegistrasi.add(buttonSubmit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
