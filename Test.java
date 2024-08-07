class Test
{
	/*
	public static void main(String[] args)
	{
		System.out.println("x of Bus is " + Bus.x);
		Bus.test();
		Bus b1 = new Bus();
		System.out.println("Y of Bus is " + b1.y);
		b1.demo();
	}
	*/

	public static void main(String[] arg)
	{

	int p = 30;
	int q = 40;
	int sum = getSum(p,q);
	System.out.println(sum + " Square is : " + sum*sum);


	}
	public static int getSum(int a, int b)
	{
		System.out.println("This is getSum method");
		int sum=a+b;
	return sum;
	
	}
		

}