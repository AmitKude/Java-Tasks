class ApplicationExecutor{
	
	public static void main(String args[]) {
		
		Application app = new Application();
		
		app.setName("Phonepe");
		app.setSizeInMb(150);
		app.setVersion("v.443.DDT");
		app.setRatings("4 Stars");
		  
		  PlayStore store = new PlayStore();
		  //has-A relationship
		  store.application = app;
		  store.managedBy = "Google";
		  
		  
		  System.out.println("The name of application is " +store.application.getName());
		  System.out.println("The size of application is " +store.application.getSizeInMb() +"MB");
		  System.out.println("The version of the application is " +store.application.getVersion());
		  System.out.println("Phonepe has around Ratings of "+ store.application.getRatings());
		  
		
	}



}