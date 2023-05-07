/**
 * File  : Pegawai.java   03/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : program SuperClass Pegawai
 */

public class Pegawai {
    String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama: " + nama + ", Gaji pokok: " + gajiPokok);
    }
}
