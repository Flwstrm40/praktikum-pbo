/**
 * File  : Bus.java   03/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : program Subclass Bus
 */

public class Bus extends Vehicle {
    void calRent (int jarak, float harga) {
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa bus = "+fare);
    }
}
