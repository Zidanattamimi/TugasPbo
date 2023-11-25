package TugasPBOabstrak;


	abstract class Tester{
	    abstract void deskripsi();

	    
	    void cuci() {
	        System.out.println(" Manfaat sayur?.");
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