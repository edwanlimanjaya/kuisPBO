package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PauL
 */
public class Penjualan {
    private String nomorFaktur;
    private double totalPenjualan;
    private enumJenis status;

    public Penjualan(String nomorFaktur, double totalPenjualan, enumJenis status) {
        this.nomorFaktur = nomorFaktur;
        this.totalPenjualan = totalPenjualan;
        this.status = status;
    }

    public String getNomorFaktur() {
        return nomorFaktur;
    }

    public void setNomorFaktur(String nomorFaktur) {
        this.nomorFaktur = nomorFaktur;
    }

    public double getTotalPenjualan() {
        return totalPenjualan;
    }

    public void setTotalPenjualan(double totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }

    public enumJenis getStatus() {
        return status;
    }

    public void setStatus(enumJenis status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Penjualan{" + "nomorFaktur=" + nomorFaktur + ", totalPenjualan=" + totalPenjualan + ", status=" + status + '}';
    }
    
    
}
