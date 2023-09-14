class CricketName{
	
	String playersNames[]= new String[11];
	int index;
	
	public boolean addPlayersName(String playersName)
	{
		System.out.println("Inside addPlayersName");
		boolean isAdded = false;
		if(playersName!=null)
		{
			System.out.println("Validation is proper.. preced to add playersNames");
			playersNames[index] = playersName;
			
			index++;
			isAdded = true;
		}
		return isAdded;
		
	}
			public void getPlayersName()
			{
				for(int index=0;index<playersNames.length;index++)
					System.out.println(playersNames[index]);
			}
		
	}