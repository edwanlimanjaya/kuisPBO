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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.util.ArrayList;
import Model.User;

/**
 *
 * @author HP
 */
public class MenuUbahProfile implements ActionListener {

    private JLabel labelLogo;
    private JLabel labelEmail;
    private JLabel labelName;
    private JLabel labelPassword;
    private JLabel labelCategory;
    private JFrame frame;
    private JButton updateUser;
    private JButton back;
    private JTextField fieldName;
    private JTextField fieldEmail;
    private JPasswordField fieldPassword;
    private JComboBox category;
    private ImageIcon image;
    private ArrayList<String> categories;
    private String[] categoriesConvert = new String[3];
    private String name;
    private String email;
    private String password;
    private int idCategory;
    private int idUser;
    private boolean update;

    public void MenuUbahProfile(User user) {
        idUser = user.getId();
        name = user.getName();
        email = user.getEmail();
        password = user.getPassword();
        idCategory = user.getIdCategory();
        
        String title = "Update";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        Labels();
        Content();
        updateUser = new JButton("Update user");
        updateUser.setBounds(50, 210, 130, 20);
        updateUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = fieldName.getText();
                email = fieldEmail.getText();
                password = String.valueOf(fieldPassword.getPassword());
                idCategory = (category.getSelectedIndex()+1);
                user.setId(idUser);
                user.setName(name);
                user.setEmail(email);
                user.setPassword(password);
                user.setIdCategory(idCategory);
                update = new Controller.DatabaseController().updateUser(user);
                if (update) {
                    new Message.MessageSuccessful().SuccessfulUpdateDatabase();
                }else{
                    new Message.MessageFailed().FailedUpdateDatabase();
                }
            }
        });
        back = new JButton("Back");
        back.setBounds(180, 210, 100, 20);
        InsertToFrame();
        back.addActionListener(this);
    }

    private void Labels() {
        image = new ImageIcon("media/images/logo.png");
        labelLogo = new JLabel(image);
        labelLogo.setBounds(10, 10, 50, 30);
        labelLogo.setOpaque(true);
        labelName = new JLabel("Name");
        labelName.setBounds(10, 50, 100, 20);
        labelEmail = new JLabel("Email");
        labelEmail.setBounds(10, 90, 100, 20);
        labelPassword = new JLabel("Password");
        labelPassword.setBounds(10, 130, 100, 20);
        labelCategory = new JLabel("Category");
        labelCategory.setBounds(10, 170, 100, 20);
    }

    private void Content() {
        fieldName = new JTextField(name);
        fieldName.setBounds(110, 50, 100, 20);
        fieldEmail = new JTextField(email);
        fieldEmail.setBounds(110, 90, 100, 20);
        fieldPassword = new JPasswordField(password);
        fieldPassword.setBounds(110, 130, 100, 20);
        categories = new Controller.DatabaseController().getCategory();
        for (int i = 0; i < categories.size(); i++) {
            categoriesConvert[i] = categories.get(i);
        }
        category = new JComboBox(categoriesConvert);
        category.setBounds(110, 170, 130, 20);
    }

    private void InsertToFrame() {
        frame.add(labelLogo);
        frame.add(labelName);
        frame.add(labelEmail);
        frame.add(labelPassword);
        frame.add(labelCategory);
        frame.add(fieldName);
        frame.add(fieldEmail);
        frame.add(fieldPassword);
        frame.add(category);
        frame.add(updateUser);
        frame.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new MainMenu();
    }
}
