class OttPlatforms1
{
	//Update
	String movieNames[]= new String[10];
	int index;
	

	//create / add / save
	public boolean addMovieName(String movieName) 
	{
		System.out.println("Inside addMovieName"); 
		boolean isAdded = false;
		
		if(index<movieNames.length)
			
	  if(movieName!=null)
	   {
	       {
		  	 boolean exists = checkIfMovieNameExists(movieName);
		  	 if(exists=false)
		  	   {
		  	       System.out.println("Validated movieName.. proceed to add Movie name");
		  	       
		  	       movieNames[index] = movieName;
		  	       
		  	       index++;
		  	       isAdded = true;
		  	       
		  	       System.out.println(movieName + " is added Successfully");
		        }
		           else
		            {
		             	System.out.println( movieName+ " already exists");
		            }
		    } 
	    }
		        else
		        {
		        	System.out.println("Movie size is full...cannot proced to add the data");
		        }
		        
		         return isAdded;
		
		
	}
	
	//read
	public void getMovieName()
	{
		System.out.println("Inside the getMovieName");
		System.out.println("List ofthe movie name: ");
		for(int index=0;index<movieNames.length;index++)
		{
			System.out.println(movieNames[index]);
		}
	}	
	
	public boolean checkIfMovieNameExists(String movieName)
	{
		System.out.println("Inside checkIfMovieNameExists()");
		boolean exists=false;
		
			for(int index=0; index<movieNames.length;index++)
	        {
		      	if(movieNames[index]==movieName)
		      	{
		      		exists=true;
		      	}
		    }
		       return exists;
	}
}