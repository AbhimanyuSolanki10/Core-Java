package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program9 {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\file_handling\\pqr.txt");
		FileWriter fw=null;
		try {
			f1.createNewFile();
			fw=new FileWriter(f1);
			System.out.println("File is created");
			fw.write(98);
			fw.write("\n");
			fw.write('@');
			fw.write("\n");
			fw.write("abcd");
			fw.write("\n");
			fw.write(97 +"");
			} 
		catch (IOException e) 
		{
			System.out.println("File is not created");
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
		}
		System.out.println("Program Ends!!");
		
	}
}
