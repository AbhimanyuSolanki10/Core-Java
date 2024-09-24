package file_handling;
import java.io.*;
import java.io.IOException;
public class Program5 {
	public static void main(String[] args) throws IOException  {
		File f1=new File("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\file_handling\\abc2.txt");
		FileWriter fw=null;
		try {
			f1.createNewFile();
			fw=new FileWriter(f1);
			System.out.println("File is created!");
			char[]x = {'a','b','c','d','e','f','g','h','i'};
			fw.write(x);
			fw.write(x,2,3);
			fw.write("\n");
			fw.write("Mohan is here",3,4);
		} catch (Exception e) {
			System.out.println("File is not created!");
			System.out.println(e.getMessage());
		}finally {
			fw.close();
		}
		System.out.println("Program Ends!");
	}
}
