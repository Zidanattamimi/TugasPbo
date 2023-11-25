package Tugas53;
/*
 * Nama Kelompok : Zidan,221106042935
 * 				   Muhammad Virzha Andriansyah,221106043023
 * Kelas 		 : Reguler A
 * Program 53	 : Untuk Menampilkan identitas hewan 	
 */
public class Animal {
	 protected boolean vegetarian;
	    protected String eats;
	    protected int noOfLegs;
	    
	    public Animal(){
	        
	    }
	    
	    public boolean isVegetarian(){
	        if(vegetarian) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    
	    public String getEats(){
	        return eats;
	    }
	    
	    public int getNoOfLegs(){
	        return noOfLegs;
	    }

	}

