package final_keyword;

public class Car {
	final static String brand ="TATA";
	final int car_no;
	double price;
	String color;
	Car(int car_no){
		this.car_no=car_no;	
	}
	Car(double price , int car_no){
		this.price=price;
		this.car_no=car_no;
	}
	
	public void getDetails() {
		System.out.println("Brand is: "+ brand);
		System.out.println("Car Number is:" +car_no);
		System.out.println("Price is: " + price);
		System.out.println("Color is: " + color);
		System.out.println("=============================");
	}
}
