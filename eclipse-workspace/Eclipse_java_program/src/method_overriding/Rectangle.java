package method_overriding;

public class Rectangle extends Shape {
		
		static int x =70;
		int y =78;
		
	
		@Override
		public void area() {
			System.out.println("Area of Circle is l*w");
		}
		
		public static void test() {
			System.out.println("test method of rectangle");
		}
}
