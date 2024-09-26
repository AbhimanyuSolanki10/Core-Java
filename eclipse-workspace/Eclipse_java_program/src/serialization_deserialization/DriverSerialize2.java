package serialization_deserialization;
import java.io.FileOutputStream;

import java.io.ObjectOutputStream;
public class DriverSerialize2 {
		public static void main(String[] args) throws Exception {
			Employ e1=new Employ("Mohan",123,34668.654,"NOIDA");
			Employ e2=new Employ("Sohan",103,65598.654,"NOIDA");
			Employ e3=new Employ("Rohan",133,89548.654,"NOIDA");
			Employ e4=new Employ("ManMohan",183,685588.654,"NOIDA");
			Employ e5=new Employ("PyareMohan",143,6696858.654,"NOIDA");
			
		    //Employ[] e= {e1,e2,e3,e4,e5};
			Employ[] e=new Employ[5];
			e[0]=e1;	e[1]=e2; 	e[2]=e3;
			e[3]=e4;	e[4]=e5;
			
			ObjectOutputStream oos =null;
			
			try {
				FileOutputStream fos = new FileOutputStream("C:\\Desktop\\Java\\eclipse-workspace\\Eclipse_java_program\\src\\serialization_deserialization\\Employ.ser");
				oos=new ObjectOutputStream(fos);
				oos.writeObject(e);
				System.out.println("Serialization is completed!! ");
			} catch (Exception x) {
				System.out.println(x.getMessage());
			}finally {
				oos.flush();
				oos.close();
			}
				
		}		
}
