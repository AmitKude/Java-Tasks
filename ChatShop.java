class ChatShop{
	
	String chatNames[]= new String[10];
	int index;
	
	public boolean addChatName(String chatName)
	{
		System.out.println("Inside addChatName");
		boolean isAdded = false;
		if(chatName!=null)
		{
			System.out.println("Validation is proper.. proceed to add Chat name");
			chatNames[index] = chatName;
			
			index++;
			isAdded = true;
			
		}
		return isAdded;
	}
	public void getChatName()
	{
		for(int index=0;index<chatNames.length;index++)
			System.out.println(chatNames[index]);
	}

}