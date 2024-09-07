import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char x;
		do{
			System.out.println("Enter the Number: ");
			int n=sc.nextInt();
			if(isPrime(n))
				System.out.println(n+" is a Prime number");
			else
				System.out.println(n+" is NOT a Prime number");
		System.out.println("Press Y/y to continue...");
		x=sc.next().charAt(0);
		}while(x=='Y' || x=='y');
		System.out.println("======Thank You! Program Ends=====");
	}
	public static boolean isPrime(int n){
		if(n<2)
			return false;
		int i=2;
		while(i*i<=n){
			if(n%i==0){
				return false;
			}
		i++;
		}
	return true;
	}
}




