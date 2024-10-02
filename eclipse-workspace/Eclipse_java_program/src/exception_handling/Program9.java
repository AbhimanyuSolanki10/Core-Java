package exception_handling;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");	
		int b=sc.nextInt();
		System.out.println(a+"+"+b+"= "+(a+b));
		System.out.println(a+"-"+b+"= "+(a-b));
		try {
			System.out.println("Try block starts");
			System.out.println(a+"/"+b+"= "+(a/b));
			System.exit(0);
			System.out.println("Try block ends!");
		}
		catch(Exception e) {
			System.out.println(a+"/"+b+"= Infinity");
		}
		finally {
			System.out.println("===finally starts======");
			sc.close();
			System.out.println("===finally ends=======");
		}
		System.out.println(a+"*"+b+"= "+(a*b));
		System.out.println("Program Ends!!");
	}

}