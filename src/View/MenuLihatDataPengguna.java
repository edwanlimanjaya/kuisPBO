/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import Model.User;

/**
 *
 * @author HP
 */
public class MenuLihatDataPengguna implements ActionListener {

    private JLabel labelLogo;
    private JLabel labelHasil;
    private JFrame frame;
    private JTextField fieldSearch;
    private JLabel labelSearch;
    private ImageIcon image;
    private JButton search;
    private JButton back;
    private String categoryName;
    private String hasil;

    public MenuLihatDataPengguna() {
        String title = "Lihat Data";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(900, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        Labels();
        Content();
        InsertToFrame();
        search.addActionListener(this);
        back.addActionListener(this);
    }

    private void Labels() {
        image = new ImageIcon("media/images/logo.png");
        labelLogo = new JLabel(image);
        labelLogo.setBounds(10, 10, 50, 30);
        labelLogo.setOpaque(true);
        labelSearch = new JLabel("Search");
        labelSearch.setBounds(10, 50, 100, 20);
        labelHasil = new JLabel();
        labelHasil.setBounds(10, 90, 800, 20);
    }

    private void Content() {
        fieldSearch = new JTextField();
        fieldSearch.setBounds(110, 50, 100, 20);
        search = new JButton("Search Now");
        search.setBounds(210, 50, 130, 20);
        back = new JButton("Back");
        back.setBounds(340, 50, 100, 20);
    }

    private void InsertToFrame() {
        frame.add(labelLogo);
        frame.add(labelSearch);
        frame.add(fieldSearch);
        frame.add(search);
        frame.add(labelHasil);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Search":
                categoryName = fieldSearch.getText();
                hasil = new Controller.DatabaseController().searchUser(categoryName);
                if (hasil != null) {
                    labelHasil.setText(hasil);
                    labelHasil.setVisible(true);
                } else {
                    new Message.MessageFailed().FailedShowData();
                }
                break;
            case "Back":
                new MainMenu();
                break;
        }

    }
}
