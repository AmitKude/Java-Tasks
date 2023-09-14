class Spotify1{
	
	String songNames[]= new String[11];
	int index;
	
	public boolean addSongName(String songName)
	{
		System.out.println("Inside addSongName");
		boolean isAdded = false;
		
		if(index<songNames.length)
			
		if(songName!=null)
		{
			{
				boolean exists = checkIfSongNameExists(songName);
				if(exists==false)
				{
			      System.out.println("Validation is proper.. preced to add songNames");
			      songNames[index] = songName;
			      
			      index++;
			      isAdded = true;
				  
				  System.out.println(songName + "is added successfully");
				}
				 else
				 {
					 System.out.println(songName + " already exists");
				 }
			}	 
		}
		else
		{
			System.out.println("song size is full...cannot proced to add the data");
		}
		return isAdded;
	}
	
	
	
	  public void getSongName()
	{
		System.out.println("Inside the getSongName");
		System.out.println("List of the players name: ");
		for(int index=0;index<songNames.length;index++)
	        {
	           System.out.println(songNames[index]);
	        }	
	}
	
	public boolean checkIfSongNameExists(String songName)
	{
		System.out.println("Inside checkIfSongNameExists()");
		boolean exists=false;
		
		for(int index=0; index<songNames.length;index++)
		{
			if(songNames[index]==songName)
			{
				exists=true;
			}
		}
			return exists;
	}	
	
	
	
}