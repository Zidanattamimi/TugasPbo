package Tugas52;
/* Nama Kelompok : Zidan,221106042935
 * 				   Muhamad Virzha Andriansyah, 221106043023
 * Kelas		 : Reguler-A
 * Program 52	 : Menampilakn Identitas Siapa kamu
 */
public class Mahasiswa extends Manusia {
	private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 Tahun sedang belajar di kelas PBO2");
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
    
    
}

