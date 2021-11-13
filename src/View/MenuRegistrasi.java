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
public class MenuRegistrasi implements ActionListener {

    private JLabel labelLogo;
    private JLabel labelEmail;
    private JLabel labelName;
    private JLabel labelPassword;
    private JLabel labelCategory;
    private JFrame frame;
    private JButton registrasi;
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
    private User user = new User();
    private ArrayList<User> userCheck = new ArrayList<>();
    private boolean insert;
    private int idTambah = 1;

    public MenuRegistrasi() {
        userCheck = new Controller.DatabaseController().getAllUsers();
        idTambah = userCheck.size();
        String title = "Registrasi";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

        Labels();
        Content();
        registrasi = new JButton("Registrasi");
        registrasi.setBounds(50, 210, 100, 20);
        back = new JButton("Back");
        back.setBounds(150, 210, 100, 20);
        InsertToFrame();
        registrasi.addActionListener(this);
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
        fieldName = new JTextField();
        fieldName.setBounds(110, 50, 100, 20);
        fieldEmail = new JTextField();
        fieldEmail.setBounds(110, 90, 100, 20);
        fieldPassword = new JPasswordField();
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
        frame.add(registrasi);
        frame.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Registrasi":
                    idTambah++;
                name = fieldName.getText();
                email = fieldEmail.getText();
                password = String.valueOf(fieldPassword.getPassword());
                idCategory = (category.getSelectedIndex() + 1);
                user.setId(idTambah);
                user.setName(name);
                user.setEmail(email);
                user.setPassword(password);
                user.setIdCategory(idCategory);
                insert = new Controller.DatabaseController().insertNewUser(user);
                if (insert) {
                    new Message.MessageSuccessful().SuccessfulInsertDatabase();
                } else {
                    new Message.MessageFailed().MessageFailedInsertDatabase();
                }

                break;
            case "Back":
                new MainMenu();
                break;
            default:
                throw new AssertionError();
        }
    }
}
