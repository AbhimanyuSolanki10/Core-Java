class Program4
{


	public static void test()
	{
		System.out.println("Program4 test method starts");
		System.out.println("Program4 test method ends");	
	}



	public static void demo()
	{
		System.out.println("Program4 demo method starts");
		test();
		Program1.drive();
		System.out.println("Program4 demo method ends");	
	}


	public static void main(String[] arg)
	{
		System.out.println("Program4 main method starts");
		demo();
		System.out.println("Program4 main method ends");	
	}


}