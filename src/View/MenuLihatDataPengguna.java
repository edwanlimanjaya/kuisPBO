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
    private JLabel labelEmail;
    private JLabel labelFieldEmail;
    private JLabel labelName;
    private JLabel labelFieldName;
    private JLabel labelPassword;
    private JLabel labelFieldPassword;
    private JLabel labelCategory;
    private JLabel labelFieldCategory;
    private JFrame frame;
    private JTextField fieldSearch;
    private JLabel labelSearch;
    private ImageIcon image;
    private JButton search;
    private String name;
    private User user;

    public MenuLihatDataPengguna() {
        String title = "Lihat Data";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        Labels();
        Content();
        InsertToFrame();
        search.addActionListener(this);
    }

    private void Labels() {
        image = new ImageIcon("media/images/logo.png");
        labelLogo = new JLabel(image);
        labelLogo.setBounds(10, 10, 50, 30);
        labelLogo.setOpaque(true);
        labelSearch = new JLabel("Search");
        labelSearch.setBounds(10, 50, 100, 20);
        labelName = new JLabel("Name");
        labelName.setBounds(10, 90, 100, 20);
        labelName.setVisible(false);
        labelEmail = new JLabel("Email");
        labelEmail.setBounds(10, 130, 100, 20);
        labelEmail.setVisible(false);
        labelPassword = new JLabel("Password");
        labelPassword.setBounds(10, 170, 100, 20);
        labelPassword.setVisible(false);
        labelCategory = new JLabel("Category");
        labelCategory.setBounds(10, 210, 100, 20);
        labelCategory.setVisible(false);

        labelFieldName = new JLabel();
        labelFieldName.setBounds(110, 90, 100, 20);
        labelFieldName.setVisible(false);
        labelFieldEmail = new JLabel();
        labelFieldEmail.setBounds(110, 130, 100, 20);
        labelFieldEmail.setVisible(false);
        labelFieldPassword = new JLabel();
        labelFieldPassword.setBounds(110, 170, 100, 20);
        labelFieldPassword.setVisible(false);
        labelFieldCategory = new JLabel();
        labelFieldCategory.setBounds(110, 210, 100, 20);
        labelFieldCategory.setVisible(false);
    }

    private void Content() {
        fieldSearch = new JTextField();
        fieldSearch.setBounds(110, 50, 100, 20);
        search = new JButton("Search Now");
        search.setBounds(210, 50, 100, 20);
    }
    
    private void InsertToFrame(){
        frame.add(labelLogo);
        frame.add(labelSearch);
        frame.add(fieldSearch);
        frame.add(search);
        frame.add(labelName);
        frame.add(labelEmail);
        frame.add(labelPassword);
        frame.add(labelCategory);
        frame.add(labelFieldName);
        frame.add(labelFieldEmail);
        frame.add(labelFieldPassword);
        frame.add(labelFieldCategory);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        name = fieldSearch.getText();
        user = new Controller.DatabaseController().searchUser(name);
        labelName.setVisible(true);
        labelEmail.setVisible(true);
        labelPassword.setVisible(true);
        labelCategory.setVisible(true);

        labelFieldName.setText(user.getName());
        labelFieldName.setVisible(true);
        labelFieldEmail.setText(user.getEmail());
        labelFieldEmail.setVisible(true);
        labelFieldPassword.setText(user.getPassword());
        labelFieldPassword.setVisible(true);
        labelFieldCategory.setText(String.valueOf(user.getIdCategory()));
        labelFieldCategory.setVisible(true);
    }
}
