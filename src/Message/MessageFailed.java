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
        JOptionPane.showMessageDialog(null, "Please complete all the fields!", "Message", JOptionPane.ABORT);
    }
}
