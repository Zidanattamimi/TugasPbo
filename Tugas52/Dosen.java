package Tugas52;
/* Nama Kelompok : Zidan,221106042935
 * 				   Muhamad Virzha Andriansyah, 221106043023
 * Kelas		 : Reguler-A
 * Program 52	 : Menampilakn Identitas Siapa kamu
 */

public class Dosen {
	private String nip;
	private String mataKuliah;
	
	public String getNip() {
		return nip;
	}
	
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public String getMataKuliah() {
		return mataKuliah;
	}
	
	public void setMataKuliah(String mataKuliah) {
		this.mataKuliah = mataKuliah;
	}
	    public void mengajarApa(){
	        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar mata kuliah PBO");
	    }

	
	    public void siapaKamu() {
	        System.out.println("Saya Dosen");
	    }
	    
public static void main(String[] args) {
	        
	        Manusia x = new Manusia();
	        Dosen y = new Dosen();
	        Mahasiswa z = new Mahasiswa();
	        
	        y.setNip("41227829930");
	        System.out.println("NIP DOSEN : "+y.getNip());
	        y.siapaKamu();
	        y.mengajarApa();        
	        System.out.println("");
	        z.setNim("10110269");
	        z.siapaKamu();
	        z.kelasApa();
	       
	        
	    }
	    
	    

}
