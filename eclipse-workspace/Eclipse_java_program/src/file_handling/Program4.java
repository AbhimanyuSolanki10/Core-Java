package file_handling;
import java.io.*;
public class Program4 {
		public static void main(String[] args) throws IOException {
			FileWriter fw=null;
			int x='@';
			System.out.println("x is :"+x);
			try {
				fw=new FileWriter("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\file_handling\\abcd.txt");
				System.out.println("File is created");
				fw.write(97);
				fw.write('@');
				fw.write("\nmohan is here");
				
			} catch (Exception e) {
				System.out.println("File is not created");
			}
			finally {
				fw.close();
			}
			System.out.println("Program Ends!!");
		}
}
