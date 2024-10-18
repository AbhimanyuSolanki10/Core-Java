package switch_case;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		do {
			performCalculation();
			System.out.println("Press Y/y to continue...");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("=======Program ends=====");
	}
	public static void performCalculation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int b=sc.nextInt();
		System.out.println("Enter the Operation(+,-,*,/): ");
		char op=sc.next().charAt(0);
		switch(op)
		{
			case '+':
				System.out.println(a+"+"+b+"= "+(a+b));
				break;
			case '-':
				System.out.println(a+"-"+b+"= "+(a-b));
				break;
			case '*':
				System.out.println(a+"*"+b+"= "+(a*b));
				break;
			case '/':
				System.out.println(a+"/"+b+"= "+(a/b));
				break;
			default:
				System.out.println("This is Not the Valid Opeartion!!");
		}
	}
	

}