class ChatShop1{
	
	String chatNames[]= new String[10];
	int index;
	
	public boolean addChatName(String chatName)
	{
		System.out.println("Inside addChatName");
		boolean isAdded = false;
		
		if(index<chatNames.length)
			
		if(chatName!=null)
		{
			{
			  boolean exists = checkIfChatNameExists(chatName);
			  if(exists==false)
			    {
			        System.out.println("Validation is proper.. proceed to add Chat name");
			       
				   chatNames[index] = chatName;
			        
			        index++;
			        isAdded = true;
			  	  
			  	  System.out.println(chatName + "is added successfully");
			    }
				   else
				   {
					   System.out.println(chatName + " already exists");
				   }
			}	 
			
		}
		  else
		  {
			  System.out.println("Chat size is full...cannot proced to add the data");
		  }
		    return isAdded;
	}
	
	public void getChatName()
	{
		System.out.println("Inside the getChatName");
		System.out.println("List of the chat name: ");
		for(int index=0;index<chatNames.length;index++)
		{
			System.out.println(chatNames[index]);
	    }
		
	}	
	
	
	public boolean checkIfChatNameExists(String chatName)
	{
		System.out.println("Inside checkIfChatNameExixts()");
		boolean exists=false;
		
		for(int index=0; index<chatNames.length;index++)
		{
			if(chatNames[index]==chatName)
			{
				exists=true;
			}
		}
			return exists;
	}

}