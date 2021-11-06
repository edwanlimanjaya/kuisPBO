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
public class MenuKasirJOption {
    
    private int menu;
    
    public MenuKasirJOption(){
        do {
             menu = Integer.parseInt(JOptionPane.showInputDialog("Selamat datang" + " " + "Nama Kasir"
                    + "\n1. Input Transaksi"
                    + "\n2. Penjualan"
                    + "\n3. Data Barang Diskon"
                    + "\n4. Menampilkan List Pekerja"
                    + "\n5. Update Data Pekerja"
                    + "\n6. Update Data Top Up"
                    + "\n7. Menghitung Total Gaji"
                    + "\n8. Menampilkan Barang Diskon"
                    + "\n9. Menampilkan List Barang"
                    + "\n10. Menampilkan Top Up"
                    + "\n11. Menampilkan List Transaksi"
                    + "\n12. Menampilkan Total Transaksi Barang"
                    + "\n13. Exit"));
        } while (true);
        
    }
}
