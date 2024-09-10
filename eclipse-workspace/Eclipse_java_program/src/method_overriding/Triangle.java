package method_overriding;

public class Triangle extends Shape {
	
		static int x=80;
		int y =85;
	
		@Override
		public void area() {
			System.out.println("Area of Circle is 0.5*b*h");
		}
		
		public static void test() {
			System.out.println("test method of Triangle");
		}
}
