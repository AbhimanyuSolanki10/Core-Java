import java.util.Scanner;
class Power
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char x;
		do{
			System.out.println("Enter a: ");
			int a=sc.nextInt();
			System.out.println("Enter b: ");
			int b=sc.nextInt();
			System.out.println(a+" to power "+b+" is: "+getPower(a,b));
		System.out.println("Press Y/y to continue...");
		x=sc.next().charAt(0);
		}while(x=='Y' || x=='y');
		System.out.println("========Thank You!! Program Ends=====");
	}
	public static int getPower(int a, int b){
		int pow=1;
		int i=1;
		while(i<=b){
			pow=pow*a;
		i++;
		}
	return pow;
	}
}