import java.util.Scanner;
class Fibonacci1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int value=getFibonacciTerm(i);
			System.out.print(value+" ");
		}
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