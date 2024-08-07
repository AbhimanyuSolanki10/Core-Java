class Bus 
{
	static int x = 30;
		 int y = 40;
	public static void test()
	{
	  System.out.println("This is static test Method"); 
	}

	public void demo()
	{
	  System.out.println("This is non-static test Method"); 
	}
	

	public static void main(String[] args)
	{
		System.out.println("This is Bus class");
		System.out.println("x is : " + x);
		test();
		Bus b1 = new Bus();
		System.out.println("Y is : " + b1.y); 
		b1.demo();
	}
}