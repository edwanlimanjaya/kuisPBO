/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Message;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MessageSuccessful {

    public void SuccessfulLoginMessage() {
        JOptionPane.showMessageDialog(null, "You have successfully logged in!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void SuccessfulInsertDatabase(){
        JOptionPane.showMessageDialog(null, "Your data has been successfully added to the database!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void SuccessfulUpdateDatabase(){
        JOptionPane.showMessageDialog(null, "Your data has been successfully updated to the database!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
    }
}
