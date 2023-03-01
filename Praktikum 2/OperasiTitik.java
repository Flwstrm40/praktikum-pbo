/* Program   : OperasiTitik.java */
/* Deskripsi : File kelas OperasiTitik*/
/* NIM/Nama  : 24060121130073/Muhammad Naufal Arkan*/
/* Tanggal   : 01-03-2023*/
/***********************************/

class OperasiTitik {
    private void refleksiSumbuX(Titik titik){
        double ordinat = titik.getOrdinat();
        ordinat = ordinat * -1;
        titik.setOrdinat(ordinat);
    }
	
	private void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		absis = absis * -1;
		titik.setAbsis(absis);
	}

    public Titik refleksiX(Titik t){
        refleksiSumbuX(t);
        return t;
    }

    public Titik refleksiY(Titik t){
        refleksiSumbuY(t);
        return t;
    }
}
