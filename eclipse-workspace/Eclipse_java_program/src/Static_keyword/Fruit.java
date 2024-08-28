package Static_keyword;

public class Fruit {

	{
		System.out.println("This is non-static block-1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main mehtod");
		System.out.println("------------------------------------------------------");
		Fruit f1=new Fruit();
		System.out.println("------------------------------------------------------");
		Fruit f2=new Fruit();
		System.out.println("------------------------------------------------------");
		Fruit f3=new Fruit();
		
		
	}
	static{
		System.out.println("This is static block-1");
	}
	{
		System.out.println("This is non-static block-2");
	}

}
