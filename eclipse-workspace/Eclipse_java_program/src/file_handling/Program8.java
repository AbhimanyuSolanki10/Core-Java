package file_handling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Program8 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name=sc.nextLine();
		System.out.println("Enter the Age: ");
		int age=sc.nextInt();
		System.out.println("Enter the Weight: ");
		String weight =sc.next();
		FileWriter fw=null;
		try {
			fw=new FileWriter("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\file_handling\\userdetails.txt");
			System.out.println("File is Created");
			fw.write("name is: "+ name + "\n");
			fw.write("Age is: "+ age+" Years");
			fw.write("\nWeight is: "+ weight + " Kg");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			fw.close();
		}
		System.out.println("Program Ends!!");
	}
}
