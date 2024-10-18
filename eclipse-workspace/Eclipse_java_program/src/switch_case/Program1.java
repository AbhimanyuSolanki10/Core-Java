package switch_case;
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice: ");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Your choice is: "+choice);
				break;
			case 2:
				System.out.println("Your choice is: "+choice);
				break;
			case 3:
				System.out.println("Your choice is: "+choice);
				break;
			case 4:
				System.out.println("Your choice is: "+choice);
				break;
			case 5:
				System.out.println("Your choice is: "+choice);
				break;
			default:
				System.out.println("This is default statement");
		}
	}
	

}