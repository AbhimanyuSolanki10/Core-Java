package file_handling;
import java.util.*;
import java.io.*;

public class Program11 {
	public static void main(String[] args) {
		File f1= new File("C:\\Desktop\\Java\\While_Loop\\Prime_number\\Prime_number1.java");
		
		try {
			Scanner sc=new Scanner(f1);
			System.out.println("File is found!");
			System.out.println(sc.hasNextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			
		} catch (FileNotFoundException e) {
			System.out.println("File is Not Found");
		}
		
	}
}
