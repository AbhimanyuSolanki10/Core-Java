package serialization_deserialization;
import java.io.*;
public class DriverSerialize1 {
	public static void main(String[] args) throws IOException {
		Employ e1= new Employ("Mohan",123,345623.698,"NOIDA");
		ObjectOutputStream oos =null;
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\serialization_deserialization\\Employ.ser");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(e1);
			System.out.println("Serialization is completed");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			oos.flush();
			oos.close();
		}
		
	}
}
