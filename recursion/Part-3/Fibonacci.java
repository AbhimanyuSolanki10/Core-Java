import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int value=getFibonacciTerm(n);
		System.out.println(n+"th Fibonacci Term is: "+value);
	}
	public static int getFibonacciTerm(int n)
	{
		if(n==1)
			return 0;
		else if(n==2 || n==3)
			return 1;
		else
			return getFibonacciTerm(n-2)+getFibonacciTerm(n-1);
	}
}