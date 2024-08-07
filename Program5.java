class Program5
{
	public static void addNumber(int p , int q)
	{
	System.out.println("This is add method ");
	int sum = p+q;
	System.out.println(" Sum of : " + p  + "," +q  "is: " + sum );
	

	}

	public static void getSquare(int x)
	{
	System.out.println("This is Test method ");
	int sq= x*x;
	System.out.println(x+ " Square is : " + sq);

	}

	public static void main(String [] args)
	{
	
	 System.out.println("main method starts ");
	 int x =12;
       getSquare(x);
	 getSquare(28);
	 addNumber(123,564);

	}

}