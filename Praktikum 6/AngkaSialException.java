/**
 * File  : AngkaSialException.java   29/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : program penggunaan eksepsi menggunakan class library java
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
