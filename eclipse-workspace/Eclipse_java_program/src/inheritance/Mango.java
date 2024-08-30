package inheritance;

public class Mango extends Fruit {
	static {
		System.out.println("Mango static block");
	}
	Mango(){
		System.out.println("Mango no-argument constructor");
	}
	{
		System.out.println("Mango non-static block");
	}
}
