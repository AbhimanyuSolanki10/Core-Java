package serialization_deserialization;

import java.io.Serializable;

public class Employ implements Serializable {
		String name;
		int id;
		double salary ;
		String address;
		Employ(){
			
		}
		Employ(String name,int id , double salary ,String address){
			this.name=name;
			this.id=id;
			this.salary=salary;
			this.address=address;
		}
}
