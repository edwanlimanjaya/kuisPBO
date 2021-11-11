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
public class MenuKasir {
    private int menu;
    
    public MenuKasir(){
        
    }
    
    private void TampilanMenuKasir(){
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Selamat datang kasir" + "Nama kasir"
                    + "\n1. Input Transaksi Barang"
                    + "\n2. Input Transaksi Top Up"
                    + "\n3. List Barang"
                    + "\n4. List Top Up"));
            switch (menu) {
                case 1:
                    new MenuTransaksi();
                    break;
                default:
                    new PesanJOption.PesanGagalJOption().PesanMenuTidakDitemukan();
            }
        } while (menu!=5);
        
    }
}
