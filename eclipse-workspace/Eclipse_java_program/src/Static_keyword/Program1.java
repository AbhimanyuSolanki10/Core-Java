package Static_keyword;

public class Program1 {
	static int x=34;
	static int y;
	
	
	static {
		System.out.println("Static bloc-1");
		System.out.println(x+ " " + y);
		x=90;
		int y = 50;
		System.out.println(x+ " " + y);
	}
	public static void main (String[] args) {
		System.out.println("this is main method " + x + " " + y);
		
	}
	
	public static void test() {
		System.out.println("The test method " + x + " " + y );
		int y = 68;
		System.out.println(x+ " " + y);
	}
	static {
		System.out.println("Static bloc-2");
		test();
	}
}
