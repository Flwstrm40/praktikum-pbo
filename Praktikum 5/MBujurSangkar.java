/**
 * File  : MBujurSangkar.java   25/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah " +bs.hitungLuas(sisi));
    }
}
