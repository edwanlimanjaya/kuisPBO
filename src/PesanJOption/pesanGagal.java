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
public class pesanGagal {
    public void pesanGagalDatabase(){
        JOptionPane.showMessageDialog(null, "Maaf, data Anda tidak berhasil masuk ke database!", "Pesan Gagal", JOptionPane.ERROR_MESSAGE);
    }
    public void pesanMenuTidakDitemukan(){
        JOptionPane.showMessageDialog(null, "Maaf, menu tidak ada!", "Pesan Error" ,JOptionPane.ERROR_MESSAGE);
    }
}
