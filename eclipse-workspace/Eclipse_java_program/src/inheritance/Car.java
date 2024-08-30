package inheritance;

public class Car  extends Vehicle{
	int hp;
	Car(){
//		super() --- Implicit constructor call
		System.out.println("Car no-argument constructor");
	}
	
	Car(int y){
//		super() --- Implicit constructor call
		System.out.println("Car int-argument constructor");
	}
}
