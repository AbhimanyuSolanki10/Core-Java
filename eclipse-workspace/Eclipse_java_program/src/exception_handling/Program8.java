package exception_handling;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
		System.out.println(a+"+"+b+"= "+(a+b));
		System.out.println(a+"-"+b+"= "+(a-b));
		try {
			System.out.println(a+"/"+b+"= "+(a/b));
		}
		catch(NullPointerException e) {
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