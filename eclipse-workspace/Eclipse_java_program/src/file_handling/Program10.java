package file_handling;
import java.io.*;
public class Program10 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\file_handling\\xyz.txt");
			System.out.println("File is created!!");
			fos.write(100);
			fos.write("\n".getBytes());
			fos.write('@');
			fos.write("\n".getBytes());
			byte[] b= {97,98,100,101,102};
			fos.write(b);
			fos.write("\n".getBytes());
			fos.write(b,2,2);
			fos.write("\n".getBytes());
			fos.write("abcd".getBytes());
			fos.write("\n".getBytes());
			String s="Mohan is here";
			fos.write(s.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println("File is not created");
			System.out.println(e.getMessage());
		}finally {
			fos.close();
		}
	
	}
}
