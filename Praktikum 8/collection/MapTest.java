/**
 * File : MapTest.java       17/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
*/
import java.util.*;
    public class MapTest {
    public static void main(String[] args) { 
        //kunci-> integer, nilai-> string
        Map<Integer, String> map = new HashMap<Integer,String>() ;
        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");
        map.put(4, "empat");
        map.put(10, "sepuluh");
        map.put(14, "empat belas");
        map.put(15, "lima belas");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        //mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
        //bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci ? tulis pada laporan anda!
        // petunjuk : gunakan iterasi seperti program ArrayListTest
        System.out.println("Tugas Kunci dan Nilai : ");
        for(Integer i : key) {
            System.out.print(i+" ="+" "+map.get(i)+"\n");
        }
    }
}