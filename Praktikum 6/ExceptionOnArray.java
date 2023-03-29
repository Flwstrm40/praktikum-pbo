/**
 * File  : ExceptionOnArray.java   29/03/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : program penggunaan eksepsi menggunakan class library java
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally{
            System.out.println("clean up code...");
        }
    }
}

