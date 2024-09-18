package inheritance;

public class Vehicle {
	String name;
	
	
	Vehicle(){
//		super() --- Implicit constructor call
		System.out.println("Vehicle no-argument constructor");
	}
	Vehicle(int x){
//		super() --- Implicit constructor call
		System.out.println("Vehicle int-argument constructor");
	}
}
