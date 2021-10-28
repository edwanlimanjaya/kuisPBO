/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PauL
 */
public class detailPenjualan {
    private String kodeBarang;
    private String nomorFaktur;
    private String tanggalPenjualan;
    private int quantity;

    public detailPenjualan(String kodeBarang, String nomorFaktur, String tanggalPenjualan, int quantity) {
        this.kodeBarang = kodeBarang;
        this.nomorFaktur = nomorFaktur;
        this.tanggalPenjualan = tanggalPenjualan;
        this.quantity = quantity;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNomorFaktur() {
        return nomorFaktur;
    }

    public void setNomorFaktur(String nomorFaktur) {
        this.nomorFaktur = nomorFaktur;
    }

    public String getTanggalPenjualan() {
        return tanggalPenjualan;
    }

    public void setTanggalPenjualan(String tanggalPenjualan) {
        this.tanggalPenjualan = tanggalPenjualan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "detailPenjualan{" + "kodeBarang=" + kodeBarang + ", nomorFaktur=" + nomorFaktur + ", tanggalPenjualan=" + tanggalPenjualan + ", quantity=" + quantity + '}';
    }
    
    
}
