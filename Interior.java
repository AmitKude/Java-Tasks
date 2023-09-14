class Interior{
	
	String materialNames[]= new String[10];
	int index;
	
	public boolean addMaterialName(String materialName)
	{
		System.out.println("Inside addMaterialName");
		boolean isAdded = false;
		if(materialName!=null)
		{
			System.out.println("Validation is proper.. preced to add material Name");
			materialNames[index] = materialName;
			
			index++;
			isAdded = true;
		}
		return isAdded;
	}
	public void getMaterialName()
	{
		for(int index=0;index<materialNames.length;index++)
			System.out.println(materialNames[index]);
	}
	
}