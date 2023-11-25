package Tugas55;
/*
 * Nama Kelompok 		: Zidan,221106042935
 * 				 		  Muhamad Virzha Andriansyah,221106043023
 * Kelas			    : Reguler A
 * Program 55.HandPhone : Untuk Menampilkan informasi Handphone
 */
public class WindowsPhone extends Handphone {
	private String WPKeyStore;
    
	 public WindowsPhone(String man, String os, String model, int harga){
	        this.manufacture = man;
	        this.operatingSystem = os;
	        this.model = model;
	        this.harga = harga;
	    }

	    public String getWpKeyStore() {
	        return WPKeyStore;
	    }

	    public void setWpKeyStore(String wpKeyStore) {
	        this.WPKeyStore = wpKeyStore;
	    }
	    
	    public static void main(String[] args) {
	       
	        
	        Android android = new Android("Samsung", "Android", "Grand", 3000000);
	        Blackberry blackberry = new Blackberry("BlackB", "RIM", "Curve", 2000000);
	        WindowsPhone windows = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
	        
	        android.displayProduct();
	        android.setKeyStore("234ibfd3840fo");
	        System.out.println("Andorid Key Store : "+android.getKeyStore());
	        System.out.println("");
	        
	        blackberry.displayProduct();
	        blackberry.setPinBB("BHS249");
	        System.out.println("PIN : "+blackberry.getpinBB());
	        System.out.println("");
	        
	        windows.displayProduct();
	        windows.setWpKeyStore("UUUQIJWORJ");
	        System.out.println("Wp Key Store : "+windows.getWpKeyStore());
	        System.out.println("");
	    }

}