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
public class MenuAdmin {
    private int menu;
    
    public MenuAdmin(){
        TampilanMenuAdmin();
    }
    
    private void TampilanMenuAdmin(){
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Selamat datang "
                    + "\n1. Registrasi Kasir"
                    + "\n2. Data barang"
                    + "\n3. Data barang diskon"
                    + "\n4. Exit"));
            switch (menu) {
                case 1:
                    new FormulirRegistrasiKasir();
                    break;
                case 2:
                    new MenuDataBarang();
                    break;
                case 3:
                    
                    break;
                default:
                    new PesanJOption.PesanTerimakasihJOption().PesanTerimaKasihMenu();
            }
        } while (menu>3);
        
    }
}
