/* Program   : MOperasiTitik.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas OperasiTitik*/
/* NIM/Nama  : 24060121130073/Muhammad Naufal Arkan*/
/* Tanggal   : 01-03-2023*/
/***********************************/

class MOperasiTitik {
    public static void main(String[] args){
        Titik t1 = new Titik(4.0,4.0);  
        OperasiTitik op = new OperasiTitik();

        System.out.println("titik(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        op.refleksiX(t1);
        System.out.println("titik setelah refleksi sb X: titik(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        op.refleksiY(t1);
        System.out.println("titik setelah refleksi sb Y: titik(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

    }
}
