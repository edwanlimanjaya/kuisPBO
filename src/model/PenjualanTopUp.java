/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class PenjualanTopUp {
    private String Nomor_FakturTopUp;
    private double Total_PenjualanTopUp;
    private Enum Jenis_Pembayaran;

    public PenjualanTopUp() {
    }

    public PenjualanTopUp(String Nomor_FakturTopUp, double Total_PenjualanTopUp, Enum Jenis_Pembayaran) {
        this.Nomor_FakturTopUp = Nomor_FakturTopUp;
        this.Total_PenjualanTopUp = Total_PenjualanTopUp;
        this.Jenis_Pembayaran = Jenis_Pembayaran;
    }

    public String getNomor_FakturTopUp() {
        return Nomor_FakturTopUp;
    }

    public void setNomor_FakturTopUp(String Nomor_FakturTopUp) {
        this.Nomor_FakturTopUp = Nomor_FakturTopUp;
    }

    public double getTotal_PenjualanTopUp() {
        return Total_PenjualanTopUp;
    }

    public void setTotal_PenjualanTopUp(double Total_PenjualanTopUp) {
        this.Total_PenjualanTopUp = Total_PenjualanTopUp;
    }

    public Enum getJenis_Pembayaran() {
        return Jenis_Pembayaran;
    }

    public void setJenis_Pembayaran(Enum Jenis_Pembayaran) {
        this.Jenis_Pembayaran = Jenis_Pembayaran;
    }
    
}
