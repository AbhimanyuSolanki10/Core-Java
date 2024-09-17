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
	static {
		System.out.println("This is a static-block");
	}
	{
		System.out.println("This is non-static block");
	}
	
	//abstract method
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
