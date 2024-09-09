package method_overloading;

public class Test {
	
	public static void start() {
		System.out.println("Start no-arg method");
	}
	public static void start(int x) {
		System.out.println("Start int-arg method");
	}
	public static void start(int x , int y ) {
		System.out.println("Start int,int-arg method");
	}
	public static void start(double x ) {
		System.out.println("Start double-arg method");
	}
}
