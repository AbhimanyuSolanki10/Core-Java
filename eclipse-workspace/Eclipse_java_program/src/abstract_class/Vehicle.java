package abstract_class;

public abstract class Vehicle {
	//abstract method
	String name;
	double price ;
	
	Vehicle(){
		
	}
	
	Vehicle(String name ,double price){
		this.name=name;
		this.price=price;
	}
	
	public abstract void start() ;
	public abstract void drive() ;
	
//	concrete method
	public void accelerate() {
		System.out.println("Accelerate the Vechicle");
	}
	
	public void stop() {
		System.out.println("Stop the Vehicle");
	}
	

}
