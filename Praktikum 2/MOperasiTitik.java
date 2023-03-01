import javax.swing.plaf.synth.SynthStyle;

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

        System.out.println("");
        Titik t2 = new Titik(9.0,-3.0);  
        OperasiTitik op2 = new OperasiTitik();
        
        System.out.println("titik(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        op2.refleksiX(t2);
        System.out.println("titik setelah refleksi sb X: titik(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        op2.refleksiY(t2);
        System.out.println("titik setelah refleksi sb Y: titik(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");

        System.out.println("");
        Titik t3 = new Titik(-7.0,-11.0);  
        OperasiTitik op3 = new OperasiTitik();

        System.out.println("titik(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        op3.refleksiX(t3);
        System.out.println("titik setelah refleksi sb X: titik(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        op3.refleksiY(t3);
        System.out.println("titik setelah refleksi sb Y: titik(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
    }
}
