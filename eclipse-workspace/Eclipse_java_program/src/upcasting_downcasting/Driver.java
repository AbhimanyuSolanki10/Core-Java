package upcasting_downcasting;

public class Driver {

	public static void main(String[] args) {
		//System.out.println(new Mango().x);
		//System.out.println(new Mango().a);
		Fruit f1=new Mango();
		System.out.println(f1.x);
		Fruit f2=new Apple();
		Fruit f3=new Orange();
		System.out.println(f2.x);
		System.out.println(f3.x);
	}

}
