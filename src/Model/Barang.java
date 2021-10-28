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
public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int stok;
    private int hargaBarang;
    private String karduluasa;
    private float presentaseDiskon;
    private String kategori;

    public Barang(String kodeBarang, String namaBarang, int stok, int hargaBarang, String karduluasa, float presentaseDiskon, String kategori) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.hargaBarang = hargaBarang;
        this.karduluasa = karduluasa;
        this.presentaseDiskon = presentaseDiskon;
        this.kategori = kategori;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String getKarduluasa() {
        return karduluasa;
    }

    public void setKarduluasa(String karduluasa) {
        this.karduluasa = karduluasa;
    }

    public float getPresentaseDiskon() {
        return presentaseDiskon;
    }

    public void setPresentaseDiskon(float presentaseDiskon) {
        this.presentaseDiskon = presentaseDiskon;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return "Barang{" + "kodeBarang=" + kodeBarang + ", namaBarang=" + namaBarang + ", stok=" + stok + ", hargaBarang=" + hargaBarang + ", karduluasa=" + karduluasa + ", presentaseDiskon=" + presentaseDiskon + ", kategori=" + kategori + '}';
    }
    
    
    
}
