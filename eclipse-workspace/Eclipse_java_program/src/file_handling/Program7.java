package file_handling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Program7 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		FileWriter fw=null;
		try {
			fw=new FileWriter("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\file_handling\\abc4.txt");
			System.out.println("File is created");
			fw.write(str);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			fw.close();
		}
		System.out.println("program Ends!!");
	}
}
