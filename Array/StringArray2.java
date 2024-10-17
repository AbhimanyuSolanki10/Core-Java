class StringArray2
{
	public static void main(String[] args)
	{
		String[] a={"Mohan", "Sohan", "jack and mac", "mohan and jack", "Rohan"};
		printStringLength(a);
	}
	public static void printStringLength(String[] a){
		int count=0;
		for(String p: a){
			if(p.length()%2==0){
				System.out.println(p+"\t ==>Size is: "+p.length());
				count++;
			}
		}
	System.out.println("Total Such Elements are: "+count);	
	}
}