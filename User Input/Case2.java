import java.util.Scanner;
class Case2
{
	public static void main(String[] arg)
	{
	  Scanner sc = new Scanner(System.in);

	  System.out.println("Enter the Age: ");
 	  int age = sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter the Name");
	  String name = sc.nextLine();
	  System.out.println("Enter the weight: ");
	  double weight = sc.nextDouble();
	  sc.nextLine();
	  System.out.println("Enter the Address: ");
	  String address = sc.nextLine();
	  System.out.println("Enter the PIN: ");
	  int pin= sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter the email id: ");
 	  String eid = sc.nextLine();
  	  System.out.println("Enter the Country name: ");
 	  String country = sc.nextLine();	
	  System.out.println("Age is : " + age);
 	  System.out.println("Name is : " + name);
	  System.out.println("Weight is : " + weight);
	  System.out.println("Address is : " + address);
	  System.out.println("pin is : " + pin);
	  System.out.println("email is : " + eid);
	  System.out.println("country is : " + country);



	}



}