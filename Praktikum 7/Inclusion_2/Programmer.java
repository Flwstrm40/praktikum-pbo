/**
 * File  : Programmer.java   03/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : program Subclass Programmer
 */

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
    }
    
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }
}

