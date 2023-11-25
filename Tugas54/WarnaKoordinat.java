package Tugas54;

public class WarnaKoordinat extends Koordinat {
	 public String namaWarna;
	    
	    public WarnaKoordinat(int x, int y, String namaWarna){
	        this.namaWarna = namaWarna;
	    }

	    public String getNamaWarna() {
	        return namaWarna;
	    }

	    public void setNamaWarna(String namaWarna) {
	        this.namaWarna = namaWarna;
	    }
	    public static void main(String[] args) {
		       
	        int x = 10;
	        int y = 4;
	        String warna = "Jingga";
	        
	        WarnaKoordinat j = new WarnaKoordinat(x, y, warna);
	        
	        j.setNamaWarna(warna);
	        j.setX(x);
	        j.setY(y);
	        
	        System.out.println("Warna Koodinat : "+j.getNamaWarna());
	        System.out.println("Koordinat Sumbu x : "+j.getX()+", y : "+j.getY());
	        
	    
	    }

	    
}
