/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Detil_PenjualanTopUp {
    private String Id_TopUp;
    private String Nomor_FakturTopUp;
    private String Tanggal_JualTopUp;
    private String Nomor_teleponPelanggan;

    public Detil_PenjualanTopUp() {
    }

    public Detil_PenjualanTopUp(String Id_TopUp, String Nomor_FakturTopUp, String Tanggal_JualTopUp, String Nomor_teleponPelanggan) {
        this.Id_TopUp = Id_TopUp;
        this.Nomor_FakturTopUp = Nomor_FakturTopUp;
        this.Tanggal_JualTopUp = Tanggal_JualTopUp;
        this.Nomor_teleponPelanggan = Nomor_teleponPelanggan;
    }

    public String getId_TopUp() {
        return Id_TopUp;
    }

    public void setId_TopUp(String Id_TopUp) {
        this.Id_TopUp = Id_TopUp;
    }

    public String getNomor_FakturTopUp() {
        return Nomor_FakturTopUp;
    }

    public void setNomor_FakturTopUp(String Nomor_FakturTopUp) {
        this.Nomor_FakturTopUp = Nomor_FakturTopUp;
    }

    public String getTanggal_JualTopUp() {
        return Tanggal_JualTopUp;
    }

    public void setTanggal_JualTopUp(String Tanggal_JualTopUp) {
        this.Tanggal_JualTopUp = Tanggal_JualTopUp;
    }

    public String getNomor_teleponPelanggan() {
        return Nomor_teleponPelanggan;
    }

    public void setNomor_teleponPelanggan(String Nomor_teleponPelanggan) {
        this.Nomor_teleponPelanggan = Nomor_teleponPelanggan;
    }
    
}
