package composition;

public class Car {
	String name;
	Engine e= new Engine(180);
	Car(){
		
	}
	Car(String name){
		this.name=name;
	}
	Car(String name , Engine e){
		this.name=name;
		this.e=e;
	}
}
