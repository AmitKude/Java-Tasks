class Hotel1{
	
	String menus[]= new String[10];
	int index;
	
	public boolean addMenu(String menu)
	{
		System.out.println("Inside addMenu");
		boolean isAdded = false;
		
		if(index<menus.length)
			
		if(menu!=null)
		{
			{
				boolean exists = checkIfMenuExists(menu);
				if(exists==false)
			    {
		         	System.out.println("Validation is proper.. preced to add Menu");
		         	
					menus[index] = menu;
		         	
		         	index++;
		         	isAdded = true;
					
					System.out.println(menu + "is added successfully");
		        }
				  else
				    {
					  System.out.println(menu+ " already exists");
				    }
			}
		}
		  else
		  {
			System.out.println("Chat size is full...cannot proced to add the data");
		  }
		    return isAdded;
	} 
	
	public void getMenu()
	{
		System.out.println("Inside the getMenu");
		System.out.println("List of menu: ");
		for(int index=0;index<menus.length;index++)
		{
			
			System.out.println(menus[index]);
	    }
	}
	
	
	public boolean checkIfMenuExists(String menu)
	{
		System.out.println("Inside checkIfMenuExists()");
		boolean exists=false;
		
		for(int index=0;index<menus.length;index++)
		{
			if(menus[index]==menu)
			{
				exists=true;
			}
		}
		return exists;
	}	
	
}