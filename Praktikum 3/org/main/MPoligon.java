/**
 * File  : MPoligon.java   08/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : driver class untuk poligon, persegi panjang, dan segitiga
 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());
		
		System.out.println("");
		
		Segitiga segitiga = new Segitiga(9, 8, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
    }
}
