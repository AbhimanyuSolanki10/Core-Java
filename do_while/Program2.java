import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		do{
			System.out.println("Enter the Number: ");
			i=sc.nextInt();
			System.out.println("You entered: "+i);
		i++;
		}while(i<=5);
		System.out.println("program Ends");
	}
}