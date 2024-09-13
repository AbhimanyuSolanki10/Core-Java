package has_a_relationship;

public class Car {
	String name;
	double price;
	Engine e = new Engine(60,6,"Diesel");
	Car(){
		
	}
	Car(String name){
		this.name=name;
	}
	Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	Car(Engine e){
		this.e=e;
	}
	Car(String name,double price ,Engine e){
		this.name=name;
		this.price=price;
		this.e=e;
	}
	
	public void getCarDetails() {
		System.out.println("Car Name is: "+ name);
		System.out.println("Car Price is: "+ price);
		e.getEngineDetails();
		System.out.println("==============================");
		//System.out.println("Car Engine HP is: "+ e.hp);
		//System.out.println("Car Engine Strokes is: "+ e.strokes);
		//System.out.println("Car Engine Type is: "+ e.type);
	}
			
}
