package exception_handling;

import java.util.Scanner;

public class Program6 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter a: ");
			int a=sc.nextInt();
			System.out.println("ENter b: ");
			int b=sc.nextInt();
			System.out.println(a+"+"+b+"= "+(a+b));
			System.out.println(a+"-"+b+"= "+(a-b));
			try {
				System.out.println("try block starts");
				System.out.println(a+"/"+b+"= "+ (a/b));
				System.out.println("try block ends!");
			}catch(ArithmeticException e){
				System.out.println(a+"/"+b+"= Infinity");
			}catch(Exception e) {
				System.out.println("Other exception is caught!");
			}
			System.out.println(a+"*"+b+"= "+ (a*b));
			System.out.println("Program Ends !!");
			
		}
}
