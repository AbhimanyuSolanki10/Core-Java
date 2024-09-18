package abstract_class;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new ElectricCar("Tesla x23",4355466.6,12,320);
		v1.start();
		v1.drive();
		v1.accelerate();
		v1.stop();
		System.out.println("==========================");
		Car c1 =(Car)v1;
		c1.openGate();
		c1.PlayMusic();
	}

}
