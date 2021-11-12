/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    
    public MenuRegistrasi(){
        String title = "Registrasi";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(300,500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        
        registrasi.addActionListener(this);
        back.addActionListener(this);
    }
    
    private void Labels(){
        labelName = new JLabel("Name");
        labelName.setBounds(10, 10, 100, 20);
        labelEmail = new JLabel("Email");
        labelEmail.setBounds(10, 50, 100, 20);
        labelPassword = new JLabel("Password");
        labelPassword.setBounds(10, 90, 100, 20);
        labelCategory = new JLabel("Category");
        labelCategory.setBounds(10, 130, 100, 20);
    }    
    
    private void Content(){
        
    }
    
    private void InsertToFrame(){
        frame.add(labelName);
        frame.add(labelEmail);
        frame.add(labelPassword);
        frame.add(labelCategory);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Registrasi":
                
                break;
            case "Back":
                new MainMenu();
                break;
            default:
                throw new AssertionError();
        }
    }
}
