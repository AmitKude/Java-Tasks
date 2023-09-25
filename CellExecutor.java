class CellExecutor{

	public static void main(String args []){
		
	    Cell energy = new Cell();
		
	    energy.setCompany("CASIO");
	    energy.setBrand("sgsagsgs");
	    energy.setPrice(1200);
	    energy.setUsed("9 months");
	  
	  
	  
	  
	  Watch time = new Watch();
	   time.cell = energy;
	  
	  System.out.println( time.cell.getCompany());
	                      
	  System.out.println( time.cell.getBrand());
	                      
	  System.out.println( time.cell.getPrice());
	                      
	  System.out.println( time.cell.getUsed());
	  
	  
	  
	
	}

}