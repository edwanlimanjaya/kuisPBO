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
                    + "\n1. Input Transaksi"));
            switch (menu) {
                case 1:
                    new FormulirPenjualanBarang();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
        
    }
}
