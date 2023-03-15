/**
 * File  : MKubus.java   15/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : driver class untuk poligon, bujurSangkar, dan kubus
 */

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
    public static void main(String[] args) {
        // bujur sangkar panjang sisi 4 satuan
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);

        // bujur sangkar panjang sisi 15 satuan
        BujurSangkar bujurSangkar2 = new BujurSangkar(15);
        Kubus kubus2 = new Kubus(bujurSangkar2);

        System.out.println("Luas Alas Kubus : " + kubus.hitungLuasAlas());
        System.out.println("Volume Kubus    : " + kubus.hitungVolume());

        System.out.println("");

        System.out.println("Luas Alas Kubus : " + kubus2.hitungLuasAlas());
        System.out.println("Volume Kubus    : " + kubus2.hitungVolume());
    }
}
