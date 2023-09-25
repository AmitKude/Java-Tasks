class Application{
	
	private String name;
	private int sizeInMb;
	private String version;
	private String ratings;
	private String noOfDownloads;
	private String companyName;
	
	
	public Application(){
		
	}
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	
	
	public void setSizeInMb(int sizeInMb)
	{
		this.sizeInMb=sizeInMb;
	}
		
	public int getSizeInMb()
	{
		return sizeInMb;
	}
	
	
	public void setVersion(String version)
	{
		this.version=version;
	}
	
	public String getVersion() 
	{
		return version;
	}
	
	public void setRatings(String ratings)
	{
		this.ratings=ratings;
	}
	
	public String getRatings()
	{
		return ratings;
	}
	
	
	

}