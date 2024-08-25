package constructor;

public class EmployDriver {
public static void main(String[] args) {
	System.out.println("This is main method");
	Employ e1= new Employ("Mohan",121,524163.256);
	e1.getDetails();
	Employ e2= new Employ()	;
	e2.getDetails();
	Employ e3= new Employ("Sohan")	;
	e3.getDetails();
	Employ e4= new Employ("Rohan",257)	;
	e4.getDetails();
	
	Employ e5= new Employ("John",140,8965.562)	;
	e5.getDetails();
	
	
	
}
}
