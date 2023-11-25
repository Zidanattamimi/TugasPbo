package Tugas59;
/* Nama Kelompok	: Zidan,221106042935
 * 					: Muhamad Virzha Andriansyah,221106043023
 * Kelas			: Reguler-A
 * Program 59.		: Untuk Menampilkan informasi karakter dalam detective Conan
 */
public class Karakter {
	protected String name;
	protected String from;
	protected boolean eyeglasses;
	
	public Karakter(String name, String from, boolean eyeglasses) {
		this.name = name;
		this.from = from;
		this.eyeglasses = eyeglasses;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFrom() {
		return from;
	}
}
