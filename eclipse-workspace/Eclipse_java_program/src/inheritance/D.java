package inheritance;

public class D extends C {
	int x = 90;
	int s =100;
	public void test() {
		System.out.println("This is test mehtod ");
		int x = 200;
		int t=210;
		System.out.println("Local t is :" + t);
		System.out.println("s of D is :" + s);
		System.out.println("r of C is :" + r);
		System.out.println("q of B is :" + q);
		System.out.println("p of A is :" + p);
		System.out.println("Local x :" + x);
		System.out.println("Global x of D is  :" + this.x);
		System.out.println("Global x of C is  :" + super.x);
		System.out.println("Global x of B is  :" + getXOfB());
		System.out.println("Global x of A is  :" + getXOfA());
		
	}
}
