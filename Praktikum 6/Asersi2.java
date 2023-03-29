/**
 * File  : Asersi2.java   29/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : program untuk demo asersi, yang akan menolak input jari-jari lingkarang yang bernilai nol
 */

// class Lingkaran
class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/*PERTANYAAN 
 Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
*/

/*JAWABAN 
 Tidak ada, scara konsep, program Asersi2 di atas sudah tepat, karena pada baris 25 terdapat asersi yang berfungsi untuk menolak input jari-jari lingkaran jika bernilai 0 atau negatif.
*/
