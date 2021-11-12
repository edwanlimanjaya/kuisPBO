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
import javax.swing.JPasswordField;
/**
 *
 * @author HP
 */
public class MenuLoginPengguna implements ActionListener{
    private JFrame frame;
    private JLabel labelLogo;
    private JLabel labelWords;
    private JLabel labelEmail;
    private JLabel labelPassword;
    private JTextField fieldEmail;
    private JPasswordField fieldPassword;
    private JButton login;
    private JButton back;
    private String email;
    private String password;
    
    public MenuLoginPengguna(){
        String title = "Login";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(300,250);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        
        login = new JButton("Login");
        login.setBounds(100,180,80,20);
        back = new JButton("Back");
        back.setBounds(180,180,80,20);
        
        Labels();
        Content();
        InsertToFrame();
    }
    
    private void Labels(){
        labelLogo = new JLabel(new ImageIcon("J:\\Semester 3\\Pemograman Berorientsi Objek\\KuisPBO\\media\\images"));
        labelLogo.setBounds(10, 10, 100, 20);
        labelWords = new JLabel("Welcome!");
        labelWords.setBounds(110,10,100,20);
        labelEmail = new JLabel("Email");
        labelEmail.setBounds(10,50,100,20);
        labelPassword = new JLabel("Password");
        labelPassword.setBounds(10,90,100,20);
    }
    
    private void Content(){
        fieldEmail = new JTextField();
        fieldEmail.setBounds(110,50, 100, 20);
        fieldPassword = new JPasswordField();
        fieldPassword.setBounds(110,90,100,20);
    }
    
    private void InsertToFrame(){
        frame.add(labelLogo);
        frame.add(labelWords);
        frame.add(labelEmail);
        frame.add(labelPassword);
        frame.add(fieldEmail);
        frame.add(fieldPassword);
        frame.add(login);
        frame.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "Login":
                email = fieldEmail.getText();
                password = String.valueOf(fieldPassword.getPassword()) ;
                boolean login = new Controller.DatabaseController().loginUser(email,password);
                
                if (login) {
                    new PesanJOption.PesanBerhasil().pesanBerhasilLogin();
                }else{
                    new PesanJOption.PesanGagal().pesanGagalLogin();
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