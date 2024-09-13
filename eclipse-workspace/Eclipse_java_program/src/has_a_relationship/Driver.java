package has_a_relationship;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1= new Car();
		Car c2= new Car();
		Car c3= new Car("MARUTI");
		Car c4= new Car(new Engine(80,8,"Petrol"));
		Car c5= new Car("AUDI",3253667.6,new Engine(90,8,"CNG"));
		Car c6= new Car();
		//System.out.println(false);
		//c5=null;
		c1.getCarDetails();
		c2.getCarDetails();
		c3.getCarDetails();
		c4.getCarDetails();
		c5.getCarDetails();
		c6.getCarDetails();
		System.out.println("========================");
		c5.e.getEngineDetails();
		System.out.println("========================");

	}

}
