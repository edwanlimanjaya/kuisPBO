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
public class menuAdminJOption {

    public int menu;
    
    private menuAdminGui gui = new menuAdminGui();
    
    public menuAdminJOption() {

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Selamat datang" + " " + "Nama Admin"
                    + "\n1. Register Kasir"
                    + "\n2. Update List Barang"
                    + "\n3. Update List Barang Diskon"
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
            switch (menu) {
                case 1:
                    gui.guiRegister();
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;
                    
                case 10:

                    break;
                
                case 11:

                    break;
                
                case 12:

                    break;
                
                case 13:
                    JOptionPane.showMessageDialog(null, "Terima kasih!\n Semoga Hari Anda Menyenangkan!");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Maaf menu tidak ada!", "Pesan Error" ,JOptionPane.ERROR_MESSAGE);
            }

        } while (menu>13);

    }
    
}
