/**
 * File  : Manajer.java   03/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : program Subclass Manajer
 */

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        setNama(nama);
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
