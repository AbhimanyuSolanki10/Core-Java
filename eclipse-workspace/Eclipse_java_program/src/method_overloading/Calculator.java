package method_overloading;

public class Calculator {
	public static void add(int x, int y) {
		System.out.println("int, int add method");
		System.out.println("Sum is: "+(x+y));
	}
	public static void add(double x, int y) {
		System.out.println("double, int add method");
		System.out.println("Sum is: "+(x+y));
	}
	public static void add(int x, double y) {
		System.out.println("int, double add method");
		System.out.println("Sum is: "+(x+y));
	}
	public static void add(double x, double y) {
		System.out.println("double, double add method");
		System.out.println("Sum is: "+(x+y));
	}
	public static void add(int x, int y, int z) {
		System.out.println("int, int, int  add method");
		System.out.println("Sum is: "+(x+y+z));
	}
	public static void add(int x, int y, double z) {
		System.out.println("int, int, double  add method");
		System.out.println("Sum is: "+(x+y+z));
	}
	public static void add(int x, double y, double z) {
		System.out.println("int, double, double  add method");
		System.out.println("Sum is: "+(x+y+z));
	}
	public static void add(double x, int y, double z) {
		System.out.println("double, int, double  add method");
		System.out.println("Sum is: "+(x+y+z));
	}
	public static void add(int x, double y, int z) {
		System.out.println("int, double, double  add method");
		System.out.println("Sum is: "+(x+y+z));
	}
	public static void add(double x, double y, double z) {
		System.out.println("double, double, double  add method");
		System.out.println("Sum is: "+(x+y+z));
	}
	
}
