class Hotel{
	
	String menus[]= new String[10];
	int index;
	
	public boolean addMenu(String menu)
	{
		System.out.println("Inside addMenu");
		boolean isAdded = false;
		if(menu!=null)
		{
			System.out.println("Validation is proper.. preced to add Menu");
			menus[index] = menu;
			
			index++;
			isAdded = true;
		}
		return isAdded;
	} 
	public void getMenu()
	{
		for(int index=0;index<menus.length;index++)
			System.out.println(menus[index]);
	}
	
}