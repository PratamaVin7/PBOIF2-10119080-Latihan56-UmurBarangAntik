/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan56.umurbarangantik;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Umur Barang Antik
 */
public class BarangAntik {
    private int umur;
    
    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur() {
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
    
}