/**
 * File  : Kubus.java   08/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : representasi dasar dari objek Kubus
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        //return Math.pow(permukaan.getPanjangSisi(), 3);
        double sisi =permukaan.getPanjangSisi();
        return sisi*sisi*sisi;
    }

    public double hitungLuasAlas(){
        double sisi =permukaan.getPanjangSisi();
        return sisi*sisi;
    }
}
