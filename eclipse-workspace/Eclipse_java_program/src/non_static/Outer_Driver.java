package non_static;

public class Outer_Driver {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.x);
		o.test();
		System.out.println("------------------------------------------------------");
		Outer.Inner i = o.new Inner();
		System.out.println(i.y);
		i.demo();
		System.out.println(o.z);
		System.out.println(i.z);
	}
}
