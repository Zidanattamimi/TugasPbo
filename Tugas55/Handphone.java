package Tugas55;
/*
 * Nama Kelompok 		: Zidan,221106042935
 * 				 		  Muhamad Virzha Andriansyah,221106043023
 * Kelas			    : Reguler A
 * Program 55.HandPhone : Untuk Menampilkan informasi Handphone
 */
public class Handphone {
	protected String manufacture;
	protected String operatingSystem;
	protected String model;
	protected int harga;
	
		public Handphone() {
			
		}
		
		public void displayProduct() {
			System.out.println("Manufactur :"+manufacture);
			System.out.println("OS :"+operatingSystem);
			System.out.println("Model :"+model);
			System.out.println("Harga :"+harga);
		}
}
