package serialization_deserialization;
import java.io.*;
public class DriverDeserialize1 {
	public static void main(String[] args)  {
		try {
			FileInputStream  fis = new FileInputStream("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\serialization_deserialization\\Employ.ser");
			ObjectInputStream  ois = new ObjectInputStream(fis);
			Employ e=(Employ)ois.readObject();
			System.out.println("Name is : " + e.name);
			System.out.println("ID is : " + e.id);
			System.out.println("Salary is : " + e.salary);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
