class AppartmentsExecutor{
    public static void main(String args []){
	
	    Flats hi = new Flats();
	    hi.setName("Rajendra");
	    hi.setId(09);
	    
	    
	    
	    Appartments ref  = new Appartments();
	    ref.villa = hi;
	    
	    
	    System.out.println(ref.villa.getName());
	    System.out.println(ref.villa.getId());
    }

}