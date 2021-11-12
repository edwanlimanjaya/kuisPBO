/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PesanJOption;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Pesan {
    
    public void PesanBelumLengkap(){
        JOptionPane.showMessageDialog(null, "Please complete all the fields!", "Message", JOptionPane.ABORT);
    }
}
