/* Program   : MOperasiTitik.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas OperasiTitik*/
/* NIM/Nama  : 24060121130073/Muhammad Naufal Arkan*/
/* Tanggal   : 01-03-2023*/
/***********************************/

class MOperasiTitik {
    public static void main(String[] args){
        // Titik t1 
        Titik t1 = new Titik(4.0,4.0);  
        OperasiTitik op = new OperasiTitik();
        
        System.out.println("titik(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        Titik tR1 = new Titik(); 
        tR1 = op.refleksiX(t1);
        System.out.println("titik setelah refleksi sb X: titik(" + tR1.getAbsis() + ", " + tR1.getOrdinat() + ")");
        tR1 = op.refleksiY(t1);
        System.out.println("titik setelah refleksi sb Y: titik(" + tR1.getAbsis() + ", " + tR1.getOrdinat() + ")");
        // Titik t1 ====end=====

        // Titik t2
        System.out.println("");
        Titik t2 = new Titik(9.0,-3.0);  
        OperasiTitik op2 = new OperasiTitik();
        
        System.out.println("titik(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        Titik tR2 = new Titik();
        tR2 = op2.refleksiX(t2);
        System.out.println("titik setelah refleksi sb X: titik(" + tR2.getAbsis() + ", " + tR2.getOrdinat() + ")");
        tR2 = op2.refleksiY(t2);
        System.out.println("titik setelah refleksi sb Y: titik(" + tR2.getAbsis() + ", " + tR2.getOrdinat() + ")");
        // Titik t2 ====end=====

        // Titik t3
        System.out.println("");
        Titik t3 = new Titik(-7.0,-11.0);  
        OperasiTitik op3 = new OperasiTitik();

        System.out.println("titik(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        Titik tR3 = new Titik();
        tR3 = op3.refleksiX(t3);
        System.out.println("titik setelah refleksi sb X: titik(" + tR3.getAbsis() + ", " + tR3.getOrdinat() + ")");
        tR3 = op3.refleksiY(t3);
        System.out.println("titik setelah refleksi sb Y: titik(" + tR3.getAbsis() + ", " + tR3.getOrdinat() + ")");
        // Titik t3 ====end=====
    }
}
