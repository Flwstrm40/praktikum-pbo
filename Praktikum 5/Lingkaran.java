/**
 * File  : Lingkaran.java   25/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : kelas implementasi IArea berupa cara menghitung luas lingkaran
 */

import static java.lang.Math.PI;

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}
