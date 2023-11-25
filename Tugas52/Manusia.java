package Tugas52;
/* Nama Kelompok : Zidan,221106042935
 * 				   Muhamad Virzha Andriansyah, 221106043023
 * Kelas		 : Reguler-A
 * Program 52	 : Menampilakn Identitas Siapa kamu
 */

public class Manusia {
	protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya Manusia"); 
    }
    

}

