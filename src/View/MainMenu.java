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

/**
 *
 * @author HP
 */
public class MainMenu implements ActionListener{
    private JFrame frame;
    private JLabel labelLogo;
    private JLabel labelWords;
    private JButton loginPengguna;
    private JButton registrasi;
    private JButton lihatDataPengguna;
    private ImageIcon image;
    
    public MainMenu(){
        String title = "Main Menu";
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        Labels();
        Content();
        InsertIntoFrame();
    }
    
    private void Labels(){
        image = new ImageIcon("media/images/logo.png");
        labelLogo = new JLabel(image);
        labelLogo.setBounds(10, 10, 50, 30);
        labelLogo.setOpaque(true);
        labelWords = new JLabel("Welcome!");
        labelWords.setBounds(110,10,100,20);
    }
    
    private void Content(){
        loginPengguna = new JButton("Login pengguna");
        loginPengguna.setBounds(10,50,130,20);
        registrasi = new JButton("Registrasi");
        registrasi.setBounds(10, 90, 100, 20);
        lihatDataPengguna = new JButton("Lihat data berdasarkan kategori");
        lihatDataPengguna.setBounds(10, 130, 230, 20);
        
        loginPengguna.addActionListener(this);
        registrasi.addActionListener(this);
        lihatDataPengguna.addActionListener(this);
    }
    
    private void InsertIntoFrame(){
        frame.add(labelLogo);
        frame.add(labelWords);
        frame.add(loginPengguna);
        frame.add(registrasi);
        frame.add(lihatDataPengguna);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "Login pengguna":
                new MenuLoginPengguna();
                break;
            case "Registrasi":
                new MenuRegistrasi();
                break;
                
            case "Lihat data berdasarkan kategori":
                new MenuLihatDataPengguna();
                break;    
            
        }
    }
}
