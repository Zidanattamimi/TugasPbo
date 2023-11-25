package Tugas57;
/* Nama Kelompok	: Zidan,221106042935
 * 					: Muhamad Virzha Andriansyah,221106043023
 * Kelas			: Reguler-A
 * Program 57	    : Untuk Menampilkan informasi Sepeda & Skateboard
 */
public class Bicycle extends Vechile {
	private int myGearCount;
	
		public Bicycle() {
			System.out.println("Bicycle");
		}
		
		public int getMyGearCount() {
			return myGearCount;
		}
		
		public void setMyGearCount(int myGearCount) {
			this.myGearCount = myGearCount;
		}
}
