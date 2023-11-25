package Tugas55;
/*
 * Nama Kelompok 		: Zidan,221106042935
 * 				 		  Muhamad Virzha Andriansyah,221106043023
 * Kelas			    : Reguler A
 * Program 55.HandPhone : Untuk Menampilkan informasi Handphone
 */
public class Android extends Handphone {
	private String keyStore;
	
		public Android(String man, String os, String model, int harga) {
			this.manufacture = man;
			this.operatingSystem = os;
			this.model = model;
			this.harga = harga;
		}
		
		public String getKeyStore() {
			return keyStore;
		}
		
		public void setKeyStore(String keyStore) {
			this.keyStore = keyStore;
		}
		
}
