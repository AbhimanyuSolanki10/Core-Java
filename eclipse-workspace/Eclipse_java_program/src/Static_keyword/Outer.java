package Static_keyword;

public class Outer {
	static int x=12;
	public static void test() 
	{
		System.out.println("test method of outer class");
		
	}
	static class inner 
	{
		static int y =45;
		public static void demo() {
			System.out.println("demo method of inner class");
		}
	}
}
	
	
