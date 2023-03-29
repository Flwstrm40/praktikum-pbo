/**
 * File  : AngkaSial.java   29/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : Program penggunaan exception buatan sendiri 
 *              Pengenalan klausa 'throw' dan 'throws'*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // Method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati dengan memasukkan angka!!!");
        }
    }
}


/* PERTANYAAN:
 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
*/

/* JAWABAN 
 1. Tidak, baris 12 pada AngkaSial.java di atas tidak dieksekusi, karena 
    pada baris 10 terdapat throw new AngkaSialException(); yang berarti jika terjadi kesalahan maka akan menampilkan pesan kesalahan yang telah ditentukan pada kelas AngkaSialException.java
 2. Ya, baris 21 pada AngkaSial.java di atas dieksekusi, karena pada baris 21 terdapat try catch yang berfungsi untuk menangkap kesalahan yang terjadi pada baris 10. 
    Throw berfungsi untuk melempar sebuah exception, sehingga saat throw terjadi, blok catch akan menangkap exception tersebut dan menampilkkan pesan kesalahan yang telah ditentukan pada kelas AngkaSialException.java.
*/
