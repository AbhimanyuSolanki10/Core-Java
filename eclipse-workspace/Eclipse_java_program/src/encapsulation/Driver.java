package encapsulation;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ e1 = new Employ();
		//e1.name="Monday";
		//System.out.println("Name is: " + e1.name);
		e1.setName("Mohan");
		System.out.println("==================================");
		System.out.println("Name is " + e1.getName());
		
	}

}
