package serialization_deserialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DriveDeserialize2 {
		public static void main(String[] args) {
			try {
				FileInputStream fis =new FileInputStream("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\serialization_deserialization\\Employ.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object[] o= (Object[])ois.readObject();
				Employ[] e= (Employ[])o;
				for(int i=0;i<e.length;i++) {
					Employ k=e[i];
					System.out.println("Name: " + k.name + "\tID: " + k.id + "\tSalary: " +k.salary + "\tAddress: " + k.address);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
				
		}
}
