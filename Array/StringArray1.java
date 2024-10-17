class StringArray1
{
	public static void main(String[] args)
	{
		String[] a={"Mohan", "Sohan", "jack and mac", "mohan and jack", "Rohan"};
		printStringLength(a);
	}
	public static void printStringLength(String[] a){
		for(String p: a){
			System.out.println(p+"\t ==>Size is: "+p.length());
		}	
	}
}