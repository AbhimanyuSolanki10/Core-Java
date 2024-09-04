package upcasting_downcasting;

public class Driver1 {

	public static void main(String[] args) {
		//Fruit f=new Fruit();
		Fruit f1=new Mango();
		Mango m1=(Mango)f1;
		System.out.println(m1.x);
		System.out.println(m1.a);
		System.out.println("=============");
		Fruit f2=new Apple();
		Apple a1=(Apple)f2;
		System.out.println(a1.x);
		System.out.println(a1.b);
	}

}
