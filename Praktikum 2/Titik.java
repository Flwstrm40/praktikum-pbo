/* Program   : Titik.java */
/* Deskripsi : File kelas Titik*/
/* NIM/Nama  : 24060121130073/Muhammad Naufal Arkan*/
/* Tanggal   : 01-03-2023*/
/***********************************/

class Titik{
	// Property
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	//method
	Titik(){
		absis = 0.0;
		ordinat = 0.0;
		counterTitik++;
	}

	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}
	
	public void setAbsis(double a){
		absis = a;
	}

	public void setOrdinat(double o){
		ordinat = o;
	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	public int getCounterTitik(){
		return counterTitik;
	}
}