package singleton;

public class Driver {
	public static void main(String[] args) {
		Car c1=Car.getInstance();
		Car c2=Car.getInstance();
		Car c3=Car.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
