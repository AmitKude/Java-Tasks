class Interior1{
	
	String materialNames[]= new String[10];
	int index;
	
	public boolean addMaterialName(String materialName)
	{
		System.out.println("Inside addMaterialName");
		boolean isAdded = false;
		
		if(index<materialNames.length)
			
		if(materialName!=null)
		{
			{
				boolean exists = checkIfMaterialNameExists(materialName);
				if(exists==false)
				{	
			      System.out.println("Validation is proper.. preced to add material Name");
			      materialNames[index] = materialName;
			      
			      index++;
			      isAdded = true;
				  
				  System.out.println(materialName + "is added successfully");
				}
				 else
				 {
					 System.out.println(materialName + " already exists");
				 }
			}	 
		}
		else
		{
			System.out.println("material size is full...cannot proced to add the data");
		}
		return isAdded;
		
	}
	
	
	public void getMaterialName()
	{
		System.out.println("Inside the getMaterialName");
		System.out.println("List of the material name: ");
		for(int index=0;index<materialNames.length;index++)
		{
			System.out.println(materialNames[index]);
		}	
		
	}
	
	
		public boolean checkIfMaterialNameExists(String materialName)
	{
		System.out.println("Inside checkIfMaterialNameExists()");
		boolean exists=false;
		
		for(int index=0; index<materialNames.length;index++)
		{
			if(materialNames[index]==materialName)
			{
				exists=true;
			}
		}
			return exists;
	}	
	
	
	
	
	
	
	
	
}