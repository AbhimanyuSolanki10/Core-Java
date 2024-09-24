package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program6 {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\file_handling\\abc3.txt");
		FileWriter fw=null;
		try {
			f1.createNewFile();
			fw=new FileWriter(f1);
			fw.write("3tergreteete");
		} catch (Exception e) {
			System.out.println("File is not created");
			System.out.println(e.getMessage());
		}finally {
			fw.close();
		}
		System.out.println("Program Ends!!");
	}
}
