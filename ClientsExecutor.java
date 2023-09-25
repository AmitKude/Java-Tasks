class ClientsExecutor{

    public static void main(String args []){
	
	    Clients ref = new Clients();
	    ref.setName("Amit");
	    ref.setAge(28);
	    ref.setCompany("HCL");
	    ref.setSalary(30000);
	    
	    
	    Companies ref1 = new Companies();
	    ref1.specilist = ref;
	    
	    System.out.println(ref1.specilist.getName() );
	    
	    System.out.println(ref1.specilist.getAge() );
	    
	    System.out.println(ref1.specilist.getCompany() );
	    
	    System.out.println(ref1.specilist.getSalary() );
	
	
    }
		
}