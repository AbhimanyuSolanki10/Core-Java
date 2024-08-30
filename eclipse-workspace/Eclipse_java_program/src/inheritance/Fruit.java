package inheritance;

public class Fruit {
	{
		System.out.println("Fruit non-static block");
	}
	Fruit(){
		System.out.println("Fruit non-argument constructor");
	}
	static {
		System.out.println("Fruit static block");
	}
}
