/**
 * File     : BangunDatarGenericTest.java    17/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi: main class untuk generic bangun datar
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // membuat objek Lingkaran
        Lingkaran l = new Lingkaran(2);
        // membuat objek BangunDatarGeneric
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        // memanggil method hitungKeliling
        System.out.println("Keliling Lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());
    }
}

