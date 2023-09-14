class OttPlatforms
{
	
	String movieNames[]= new String[4];
	int index;
	

	//create / add / save
	public boolean addMovieName(String movieName) 
	{
		System.out.println("Inside addMovieName"); 
		boolean isAdded = false;
		if(movieName!=null) 
		{
			System.out.println("Validation is proper.. proceed to add Movie name");
			
			movieNames[index] = movieName;
			
			index++;
			isAdded = true;
		}
		return isAdded;
		
		
	}
	public void getMovieName(){
			for(int index=0; index<movieNames.length;index++)
				System.out.println(movieNames[index]);
		}
}