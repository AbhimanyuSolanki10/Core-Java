package switch_case;

import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		do {
			performOperations();
			System.out.println("Press Y/y to continue...");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("=======Program ends=====");
	}
	public static void performOperations() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 to get Factorial: ");
		System.out.println("2 to get power: ");
		System.out.println("3 to get Prime Number: ");
		System.out.println("4 to get Reverse Number: ");
		System.out.println("5 to get Palindrome Number: ");
		System.out.println("6 to Print Pyramid: ");
		System.out.println("7 to print Diamond: ");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("You Entered Factorial Program!!");
				System.out.println("Enter the Number to get Factorial");
				int num = sc.nextInt();
				int fact=1;
				for(int i=1;i<=num;i++) {
					fact=fact*i;	
				}
				System.out.println(num+"! = "+ fact);
				break;
			case 2:
				System.out.println("You Entered into Power Program!!");
				System.out.println("Enter the first Number");
				int a = sc.nextInt();
				System.out.println("Enter the second Number");
				int b = sc.nextInt();
				int res=1;
				for(int i=1;i<=b;i++) {
					res=res*a;
				}
				System.out.println(a+" power "+ b+ " is :"+ res);
				break;
			case 3:
				System.out.println("You Entered into PrimeNumber!!");
				System.out.println("Enter the Number");
				int p = sc.nextInt();
				for(int i=2;i*i<p;i++) {
					if(p%i==0) {
						System.out.println("Not Prime number");
						return;
					}
				}
				System.out.println(" Prime number ");
			
				break;
			case 4:
				System.out.println("You Entered into ReverseNumber !!");
				System.out.println("Enter the Number ");
				int no = sc.nextInt();
				int rev= 0;
				while(no>0) {
					int digit = no%10;
					rev= rev*10 + digit;
					no=no/10;
				}
				System.out.println("Reverse number " + rev);	
				
				break;
			case 5:
				System.out.println("You Entered into Palindrome !!");
				System.out.println("Enter the Number ");
				int a1 = sc.nextInt();
				int x=a1;
				int reverse=0;
				while(x>0) {
					int digit = x%10;
					reverse= reverse*10 + digit;
					x=x/10;
				}
				if(reverse==a1)
					System.out.println("Palindrome Number");	
				else
					System.out.println("Not a Palindrome Number");	
					
				
				break;
			case 6:
				System.out.println("You Entered into print Pyramid Program !!");
				System.out.println("Enter the Number ");
				int py = sc.nextInt();
				int star=1; int space=py-1;
				for(int i=0;i<py;i++) {
					for(int j=0;j<space;j++) {
						System.out.print("  ");
					}
					for(int j=0;j<star;j++) {
						System.out.print("* ");
					}
					star+=2; space--;
					System.out.println();
				}	
				break;
			case 7:
				System.out.println("You Entered into print Diamond Program !!");
				System.out.println("Enter the Number ");
				int d = sc.nextInt();
				int star1=1; int space1=d-1;int mid=d/2;
				for(int i=0;i<d;i++) {
					for(int j=0;j<space1;j++) {
						System.out.print("  ");
					}
					for(int j=0;j<star1;j++) {
						System.out.print("* ");
					}
					if(i<mid){
						star1 = star1+2; space1--;
					}else {
						star1= star1-2; space1++;
					}
					System.out.println();
				}	
				break;
		
			default:
				System.out.println("This is Not the Valid Opeartion!!");
		}
	}
	

}