/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DeleteBarang {
    
    public DeleteBarang(){
        
    }
    
    private void Hasil(){
        String cari = CariNamaBarang();
        
        if (cari!=null) {
            new PesanJOption.PesanBerhasilJOption().PesanBerhasilDeleteDatabase();
        }else{
            new PesanJOption.PesanGagalJOption().PesanGagalHapusDatabase();
        }
    }
    
    private String CariNamaBarang(){
        String kodeBarangCari = JOptionPane.showInputDialog(null, "Kode Barang", "Cari Barang", JOptionPane.QUESTION_MESSAGE);
        
        if (kodeBarangCari.equals("Cari")) {
            return kodeBarangCari;
        }else{
            return null;
        }
    }
}
