package file_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program14 {
		public static void main(String[] args) throws IOException {
			try {
				FileReader fr= new FileReader("C:\\Desktop\\Java\\While_Loop\\Prime_number\\Prime_number1.java");
				int x=fr.read();
				while(x!=-1) {
					System.out.print((char)x);
					x=fr.read();
			
				}
			} catch (FileNotFoundException e) {
				System.out.println("File is Not Found");
			}
		
		}
}
