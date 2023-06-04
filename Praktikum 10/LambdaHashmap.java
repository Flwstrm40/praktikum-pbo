/**
 * File : LambdaHashmap.java        31/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi : Implementasi lambda pada map, digunakan sebagai parameter pada method.
*/
import java.util.*;

public class LambdaHashmap{
    public static void main(String[] args){
        HashMap<String, String> mahasiswaMap = new HashMap<String, String>();
        mahasiswaMap.put("24060121130073", "Muhammad Naufal Arkan");
        mahasiswaMap.put("24060121130074", "Muhammad Naufal Arkan Lana");
        mahasiswaMap.put("24060121130075", "Muhammad Naufal Arkan Luna");
        mahasiswaMap.put("24060121130076", "Muhammad Naufal Arkan Mana");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
} 
