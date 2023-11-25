package Tugas59;
/* Nama Kelompok	: Zidan,221106042935
 * 					: Muhamad Virzha Andriansyah,221106043023
 * Kelas			: Reguler-A
 * Program 59.		: Untuk Menampilkan informasi karakter dalam detective Conan
 */
public class KarakterUtama extends Karakter {
	private String speciality;
	private String goal;
	
	public KarakterUtama(String speciality, String goal, String name, String from, boolean eyeglasses) {
		super(name, from, eyeglasses);
		this.speciality = speciality;
		this.goal = goal;
	}
	 
	 public String getSpeciality() {
	        return speciality;
	    }

	    public String getGoal() {
	        return goal;
	    }
	    
	    public void TampilKarakter() {
	        System.out.println("Nama : " +name);
	        System.out.println("-----");
	        System.out.println("Dari : " +from);
	        
	        if (eyeglasses) {
	            System.out.println("Kecamata : Iya");
	        } else {
	            System.out.println("Kecamata : Tidak");
	        }
	        
	        System.out.println("Specialis : " + speciality);
	        System.out.println("Tujuan : " + goal);
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        KarakterUtama kogoro = new KarakterUtama("Detektif Swasta", "Memecahkan kasus","Kogoro Mouri", "Osaka",false);
	        kogoro.TampilKarakter();
	        KarakterUtama conan = new KarakterUtama("Investigator", "Menyelesaikan Kasus","Conan Edogawa","Tokyo",true);
	        conan.TampilKarakter();        
	        KarakterPendukung eisuke = new KarakterPendukung("Teman Sekelas Ran Mouri","Eisuke Hondo","Osaka",false);      
	        eisuke.tampilKarakter();
	        KarakterUtama ran = new KarakterUtama("Karate", "Sama seperti Shinichi","Ran Mouri","Osaka",false);
	        ran.TampilKarakter();
	    }
}
