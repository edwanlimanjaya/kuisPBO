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
/**
 *
 * @author HP
 */
public class MenuRegistrasi implements ActionListener{
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
    private String[]categories;
    
    public MenuRegistrasi(){
        String title = "Registrasi";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(300,500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        
        Labels();
        Content();
        InsertToFrame();      
        registrasi.addActionListener(this);
        back.addActionListener(this);
    }
    
    private void Labels(){
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
    
    private void Content(){
        fieldName = new JTextField();
        fieldName.setBounds(110, 50, 100, 20);
        fieldEmail = new JTextField();
        fieldEmail.setBounds(110, 90, 100, 20);
        fieldPassword = new JPasswordField();
        fieldPassword.setBounds(110, 130, 100, 20);
        categories = new Controller.DatabaseController().getCategory();
        category = new JComboBox(categories);
        category.setBounds(110, 170, 100, 20);
    }
    
    private void InsertToFrame(){
        frame.add(labelLogo);
        frame.add(labelName);
        frame.add(labelEmail);
        frame.add(labelPassword);
        frame.add(labelCategory);
        frame.add(fieldName);
        frame.add(fieldEmail);
        frame.add(fieldPassword);
        frame.add(category);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Registrasi":
                new Message.MessageSuccessful().SuccessfulLoginMessage();
                break;
            case "Back":
                new MainMenu();
                break;
            default:
                throw new AssertionError();
        }
    }
}
