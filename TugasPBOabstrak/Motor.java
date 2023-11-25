package TugasPBOabstrak;

	public class Motor extends Kendaraan {
	   
	    void deskripsi() {
	        System.out.println("Motor adalah kendaraan roda dua");
	        
	    }


	    public static void main(String[] args) {
	        Mobil mobil = new Mobil();
	        Motor motor = new Motor();

	        mobil.cuci();
	        mobil.deskripsi();

	        motor.cuci();
	        motor.deskripsi();
	    }
	
}
