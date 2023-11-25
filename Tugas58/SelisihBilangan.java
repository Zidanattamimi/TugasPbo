package Tugas58;

public class SelisihBilangan extends Bilangan {
	public void tampilSelisih() {
		int selisih = getX() - getY();
		System.out.println("Hasil Selisih"+getX()+"-"+getY()+ "= "+selisih);
	}
	
	public static void main (String[] args) {
		 JumlahBilangan x = new JumlahBilangan();
		 SelisihBilangan y = new SelisihBilangan();
		 
		 x.tampilHasilJumlah();
		 y.tampilSelisih();
		 
	}
}
