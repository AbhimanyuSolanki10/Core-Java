package exception_handling;

public class Program15 {
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		System.out.println("This is test method");
		test();
	}

}