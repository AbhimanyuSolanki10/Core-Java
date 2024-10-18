package switch_case;

import java.util.Scanner;

public class CheckCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		do {
			checkCharacter();
			System.out.println("Press Y/y to continue...");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("=======Program ends=====");
	}
	public static void checkCharacter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c=sc.next().charAt(0);
		switch(c)
		{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println(c+" is a Vowel Character");
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				System.out.println(c+" is a Numeric Character");
				break;
			default:
				System.out.println(c+" is an other character!!");
		}
	}
}