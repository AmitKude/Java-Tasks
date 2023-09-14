class CricketName1{
	
	String playersNames[]= new String[11];
	int index;
	
	public boolean addPlayersName(String playersName)
	{
		System.out.println("Inside addPlayersName");
		boolean isAdded = false;
		
		if(index<playersNames.length)
			
		if(playersName!=null)
		{
			{
				boolean exists = checkIfPlayerNameExists(playersName);
				if(exists==false)
				{
			      System.out.println("Validation is proper.. preced to add playersNames");
			      playersNames[index] = playersName;
			      
			      index++;
			      isAdded = true;
				  
				  System.out.println(playersName + "is added successfully");
				}
				  else
				    {
					    System.out.println(playersName + " already exists");
				    }

			}	  
		}
		 else
		 {
			 System.out.println("players size is full...cannot proced to add the data");
		 }
		 
		return isAdded;
		
	}
			public void getPlayersName()
			{
			 System.out.println("Inside the getPlayersName");
		        System.out.println("List of the players name: ");
			     for(int index=0;index<playersNames.length;index++)
			     {
			   	 System.out.println(playersNames[index]);
			     }
			}
			
			
	public boolean checkIfPlayerNameExists(String playersName)
	{
		System.out.println("Inside checkIfPlayerNameExists()");
		boolean exists=false;
		
		for(int index=0; index<playersNames.length;index++)
		{
			if(playersNames[index]==playersName)
			{
				exists=true;
			}
		}
			return exists;
	}	
	
}