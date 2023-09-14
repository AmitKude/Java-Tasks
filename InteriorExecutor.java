class InteriorExecutor{
	
	public static void main(String args[])
	{
		Interior work = new Interior();
		work.addMaterialName("PlyWood");
		work.addMaterialName("Glass");
		work.addMaterialName("Marble");
		work.addMaterialName("Metal");
		work.addMaterialName("Plastic");
		work.addMaterialName("Granite");
		work.addMaterialName("Ingis");
		work.addMaterialName("Door Handle");
		work.addMaterialName("Door Stopper");
		work.addMaterialName("Brass");
		
		work.getMaterialName();
	}
}