/**
 * File  : BangunDatar.java   25/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : Kelas abstrak, berisi abstraksi bangun datar
 */
 
public abstract class BangunDatar{
    protected double luas;
    
    public abstract double hitungLuas(double sisi);
    
    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}
 
/*Jawaban: Apabila kelas BujurSangkar tidak membuat implementasi metode abstrack yang ada pada kelas
 *         BangunDatar, maka akan terjadi error pada saat kompilasi. Hal ini dikarenakan kelas BujurSangkar
 *         merupakan kelas turunan dari kelas BangunDatar, sehingga kelas BujurSangkar harus mengimplementasi
 *         metode abstrak yang ada pada kelas BangunDatar.
 */