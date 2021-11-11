/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class MenuBayar implements ActionListener {

    private String metodePembayaran;
    private JFrame frameMetodePembayaran;
    private JLabel labelMetodePembayaran;
    private JLabel labelNominal;
    private JLabel labelNomorRekening;
    private JRadioButton tunai;
    private JRadioButton atm;
    private JButton bayar;
    private JButton membatalkan;
    private JTextField fieldNominal;
    private JTextField fieldNomorRekening;

    public MenuBayar() {
        int pilih = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "Apakah Anda yakin melakukan pembayaran?", "Menu Pembayaran", pilih);

        if (pilih == JOptionPane.YES_OPTION) {
            FrameMetodePembayaran();
        } else {
            new MenuKasir();
        }
    }

    private void FrameMetodePembayaran() {
        String title = "Metode Pembayaran";
        frameMetodePembayaran = new JFrame();
        frameMetodePembayaran.setTitle(title);
        frameMetodePembayaran.setSize(300, 200);
        frameMetodePembayaran.setLocationRelativeTo(null);
        frameMetodePembayaran.setLayout(null);
        frameMetodePembayaran.setVisible(true);

        bayar = new JButton("Bayar");
        bayar.setBounds(10, 170, 100, 20);
        membatalkan = new JButton("Membatalkan");
        membatalkan.setBounds(110, 170, 100, 20);
    }

    private void LabelMetodePembayaran() {
        labelMetodePembayaran = new JLabel("Metode pembayaran");
        labelMetodePembayaran.setBounds(10, 10, 100, 20);
        labelNominal = new JLabel("Nominal");
        labelNominal.setBounds(10, 50, 100, 20);
        labelNominal.setVisible(false);
        labelNomorRekening = new JLabel("Nomor Rekening");
        labelNomorRekening.setBounds(210, 50, 150, 20);
    }

    private void ContentMetodePembayaran() {
        tunai = new JRadioButton("Tunai");
        tunai.setBounds(110, 10, 50, 20);
        fieldNominal = new JTextField();
        fieldNominal.setBounds(110, 50, 100, 20);
        fieldNominal.setVisible(false);
        fieldNomorRekening = new JTextField();
        fieldNomorRekening.setBounds(360, 50, 100, 20);

        tunai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tunai.isSelected()) {
                    labelNominal.setVisible(true);
                    fieldNominal.setVisible(true);
                }
            }
        });

        atm = new JRadioButton("ATM");
        atm.setBounds(160, 10, 50, 20);
        atm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (atm.isSelected()) {
                    labelNominal.setVisible(true);
                    fieldNominal.setVisible(true);
                    labelNomorRekening.setVisible(true);
                    fieldNomorRekening.setVisible(true);
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Bayar":
                new PesanJOption.PesanBerhasilJOption().PesanBerhasilPembayaran();
                break;

            case "Membatalkan":
                new PesanJOption.PesanGagalJOption().PesanGagalPembayaran();
                new MenuKasir();
                break;
        }
    }
}
