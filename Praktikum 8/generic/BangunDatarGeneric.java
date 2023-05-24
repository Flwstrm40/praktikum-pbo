/**
 * File       : BangunDatarGeneric.java       17/05/2023
 * Penulis    : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : Kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric<T1234 extends BangunDatar> {
    private T1234 bangunDatar;

    public void set(T1234 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1234 get(){
        return bangunDatar;
    }    

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

/* Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan ! */
// Jawab : Tidak ada perubahan, program tetap berjalan dengan baik dan sama seperti sebelumnya,
//          karena T hanya sebagai penamaan variabel saja, dan tidak mempengaruhi program.
//          Kode ini sudah dirubah dari T menjadi T1234
