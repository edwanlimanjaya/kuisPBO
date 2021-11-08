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
public class PesanBerhasil {
    public void PesanBerhasilDatabase(){
        JOptionPane.showMessageDialog(null, "Data Anda berhasil ditambahkan dalam database!", "Pesan Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }
    public void PesanBerhasilDeleteDatabase(){
        JOptionPane.showMessageDialog(null, "Data Anda berhasil dihapus dalam database!", "Pesan Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }
}
