/* Program   : Titik.java */
/* Deskripsi : file class Titik*/
/* NIM/Nama  : 24060121130073/Muhammad Naufal Arkan*/
/* Tanggal   : 22-02-2023*/
/***********************************/

class Titik{
	// Property
	double absis;
	double ordinat;
	static int counterTitik;
	
	//method
	Titik(){
		absis = 0.0;
		ordinat = 0.0;
		counterTitik++;
	};

	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	};
	
	void setAbsis(double a){
		absis = a;
	}

	void setOrdinat(double o){
		ordinat = o;
	}

	double getAbsis(){
		return absis;
	}

	double getOrdinat(){
		return ordinat;
	}

	int getCounterTitik(){
		return counterTitik;
	}
}