class Spotify{
	
	String songNames[]= new String[11];
	int index;
	
	public boolean addSongName(String songName)
	{
		System.out.println("Inside addSongName");
		boolean isAdded = false;
		if(songName!=null)
		{
			System.out.println("Validation is proper.. preced to add songNames");
			songNames[index] = songName;
			
			index++;
			isAdded = true;
		}
		return isAdded;
	}
	public void getSongName()
	{
		for(int index=0;index<songNames.length;index++)
			System.out.println(songNames[index]);
	}
}