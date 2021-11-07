/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class FormulirUpdateTopUp {
    private JFrame frame;
    private JButton masukan;
    private JButton membatalkan;
    private JLabel labelIdTopUp;
    private JLabel labelPajakTopUp;
    private JLabel labelHargaTopUp;
    private JLabel labelTipeTopUp;
    private JLabel labelNomorTelepon;
    private JTextField fieldIdTopUp;
    private JSpinner pajakTopUp;
    private JTextField fieldHargaTopUp;
    private JTextField fieldTipeTopUp;
    private JTextField fieldNomorTelepon;
    
    public FormulirUpdateTopUp(){
        String title = "Formulir Update TopUp";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        masukan = new JButton("Masukan");
        masukan.setBounds(15, 220, 100, 20);
        membatalkan = new JButton("Membatalkan");
        membatalkan.setBounds(115, 220, 150, 20);
        Labels();
        Content();
        InsertToFrame();
    }
    
    private void Labels() {
        labelIdTopUp = new JLabel("Id TopUp");
        labelIdTopUp.setBounds(10, 5, 100, 20);
        labelPajakTopUp = new JLabel("Pajak TopUp");
        labelPajakTopUp.setBounds(10, 45, 100, 20);
        labelHargaTopUp = new JLabel("Harga TopUp");
        labelHargaTopUp.setBounds(10, 85, 100, 20);
        labelTipeTopUp = new JLabel("Tipe TopUp");
        labelTipeTopUp.setBounds(10, 125, 100, 20);
        labelNomorTelepon = new JLabel("Harga TopUp");
        labelNomorTelepon.setBounds(10, 165, 100, 20);
    }

    private void Content() {
        fieldIdTopUp = new JTextField();
        fieldIdTopUp.setBounds(110, 5, 100, 20);
        pajakTopUp = new JSpinner();
        pajakTopUp.setBounds(110, 45, 100, 20);
        fieldHargaTopUp = new JTextField();
        fieldHargaTopUp.setBounds(110, 85, 100, 20);
        fieldTipeTopUp = new JTextField();
        fieldTipeTopUp.setBounds(110, 125, 100, 20);
        fieldNomorTelepon = new JTextField();
        fieldNomorTelepon.setBounds(110, 165, 100, 20);
    }

    private void InsertToFrame() {
        frame.add(labelIdTopUp);
        frame.add(labelPajakTopUp);
        frame.add(labelHargaTopUp);
        frame.add(labelTipeTopUp);
        frame.add(labelNomorTelepon);
        frame.add(fieldIdTopUp);
        frame.add(pajakTopUp);
        frame.add(fieldHargaTopUp);
        frame.add(fieldTipeTopUp);
        frame.add(fieldNomorTelepon);
        frame.add(masukan);
        frame.add(membatalkan);
    }
}
