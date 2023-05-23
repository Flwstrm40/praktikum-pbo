/**
 * File     : Lingkaran.java    17/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi: implementasi Lingkaran sebagai BangunDatar
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 *jejari * 3.14;
    }
}