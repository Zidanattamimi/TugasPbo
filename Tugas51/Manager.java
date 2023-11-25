package Tugas51;
import java.util.Scanner;
		public class Manager extends GajiKaryawan {
			  private int kehadiran;
			    private float tunjanganGolongan;
			    private float tunjanganJabatan;
			    private float tunjanganKehadiran;

			    public int getKehadiran() {
			        return kehadiran;
			    }

			    public void setKehadiran(int kehadiran) {
			        this.kehadiran = kehadiran;
			    }
			    
			    public float tunjanganKehadiran(int hadir){
			        tunjanganKehadiran = hadir * 10000;
			        return tunjanganKehadiran;
			    }
			    
			    public float tunjanganJabatan(String jabatan){
			        if (jabatan.equalsIgnoreCase("Manager")) {
			            tunjanganJabatan = 2000000;
			        }
			        else if (jabatan.equalsIgnoreCase("KaBag")) {
			            tunjanganJabatan = 1000000;
			        }
			        else {
			            tunjanganJabatan = 0;
			        }
			        return tunjanganJabatan;
			        }    
			    
			    public float tunjanganGolongan(int golongan){
			        if (golongan == 1){
			            tunjanganGolongan=500000;
			        }else if(golongan == 2){
			            tunjanganGolongan=1000000;
			        }else if(golongan == 3){
			            tunjanganGolongan=1500000;
			        }
			        return tunjanganGolongan;
			    }
			    
			    public float totalGaji(){
			        return tunjanganJabatan+tunjanganGolongan+tunjanganKehadiran;
			    }
			
			    public static void main(String [] args) {
			    
			    Manager m = new Manager();
		        Scanner scan = new Scanner(System.in);
		        
		        System.out.println("====Program Perhitungan Gaji Karyawan====");
		        System.out.print("Masukan NIK : ");
		        m.setNik(scan.nextLine());
		        
		        System.out.print("Masukan Nama: ");
		        m.setNama(scan.nextLine());
		        
		        System.out.print("Masukan Golongan (1/2/3) : ");
		        m.setGolongan(scan.nextInt());
		        
		        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
		        m.setJabatan(scan.next());
		        
		        System.out.print("Masukan Jumlah Kehadiran : ");
		        m.setKehadiran(scan.nextInt());
		        
		        System.out.println();
		        System.out.println("====Hasil Perhitungan====");
		        System.out.println("NIK      : " + m.getNik());
		        System.out.println("NAMA 	 : " + m.getNama());
		        System.out.println("GOLONGAN : " + m.getGolongan());
		        System.out.println("JABATAN  : " + m.getJabatan() + "\n");
		        System.out.println("TUNJANGAN GOLONGAN  : " + m.tunjanganGolongan(m.getGolongan()));
		        System.out.println("TUNJANGAN JABATAN   : " + m.tunjanganJabatan(m.getJabatan()));
		        System.out.println("TUNJANGAN KEHADIRAN : " + m.tunjanganKehadiran(m.getKehadiran()) + "\n");
		        System.out.println("GAJI TOTAL : " + m.totalGaji());
		   
		    }
		    
		}


