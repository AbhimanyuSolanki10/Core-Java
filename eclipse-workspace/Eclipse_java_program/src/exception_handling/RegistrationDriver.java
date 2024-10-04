package exception_handling;

import java.util.Scanner;

public class RegistrationDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter age: ");
		int age=sc.nextInt();
		try {
			Registration.checkEligiblity(age);
		} catch (UnderAgeException e) {
			System.out.println("Message is: "+e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Program Ends!!");
	}

}