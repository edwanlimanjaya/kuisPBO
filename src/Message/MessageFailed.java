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
public class MessageFailed {

    public void LoginFailedMessage() {
        JOptionPane.showMessageDialog(null, "You have not successfully logged in!", "Sorry!", JOptionPane.ERROR_MESSAGE);
    }
    
    public void MessageIncomplete(){
        JOptionPane.showMessageDialog(null, "Please complete all the fields!", "Sorry!", JOptionPane.WARNING_MESSAGE);
    }
    
    public void MessageIncompletePassword(){
        JOptionPane.showMessageDialog(null, "Your password must have 8 or more characters!", "Sorry", JOptionPane.WARNING_MESSAGE);
    }
    
    public void MessageFailedInsertDatabase(){
        JOptionPane.showMessageDialog(null, "Your data cannot be entered into the database!", "Sorry!", JOptionPane.ERROR_MESSAGE);
    }
    
    public void FailedUpdateDatabase(){
        JOptionPane.showMessageDialog(null, "Your data cannot be updated to the database!", "Sorry!", JOptionPane.ERROR_MESSAGE);
    }
}
