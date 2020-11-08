/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main Kubus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Massa : " + kubus.getMassa());
        
        System.out.println("\n=====Hasil Perhitungan======");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
    }
    
}
