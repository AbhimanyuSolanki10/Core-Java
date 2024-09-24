package final_keyword;

public class Driver {
	public static void main(String[] args) {
		Car c1=new Car(235);
		c1.getDetails();
		c1.price=4654756.7;
		c1.color="White";
		c1.getDetails();
		Car c2=new Car(346544.56,400);
		c2.getDetails();
		Car c3=new Car(222);
		c3.getDetails();
		
	}
}
