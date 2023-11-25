package Tugas56;

public class Radio extends BarangAntik {
	private String name;
	
	public Radio(int umur) {
		super(umur);
	}
	
	 public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public static void main(String[] args) {     
	        Radio x = new Radio(234);
	        x.setName("Radio AM");
	        System.out.println("Nama Barang Antik : "+x.getName());
	        x.tampilUmur();
	    }
}
  
