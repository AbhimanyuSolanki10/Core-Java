package file_handling;
import java.io.*;
public class Program13 {
		public static void main(String[] args) throws Exception {
			try {
				FileReader fr= new FileReader("C:\\Desktop\\Java\\While_Loop\\Prime_number\\Prime_number1.java");
				System.out.println((char)fr.read());
			} catch (FileNotFoundException e) {
					System.out.println("File is Not Found");
			}
			
		}
}
