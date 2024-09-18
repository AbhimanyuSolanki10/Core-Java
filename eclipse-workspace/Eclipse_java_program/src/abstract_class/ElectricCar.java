package abstract_class;

public class ElectricCar extends Car {
	int volt;
	ElectricCar(){
		
	}
	ElectricCar(String name,double price,int hp ,int volt){
		super(name,price,hp);
		this.volt=volt;
	}
	
	public void start() {
		System.out.println("Star the Electric Car");
	}
	public void drive() {
		System.out.println("Drive the Electric Car");
	}
	public void openGate() {
		System.out.println("Open Gate in Electric Car");
	}
}
