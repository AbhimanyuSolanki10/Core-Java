package file_handling;

import java.io.File;

public class Program3 {
	public static void main(String[] args) {
		File f1=new  File("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\file_handling\\abc.txt");
		try {
			f1.createNewFile();
			System.out.println("File Is Created");
			System.out.println("File Size is :" + f1.length());
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			f1.setWritable(false);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File is not Created");
			System.out.println(e.getMessage());
			
		}
		System.out.println("Program Ends");
	}
}
