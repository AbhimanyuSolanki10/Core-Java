package method_overriding;

public class Circle extends Shape {
		
		static int x=60;
		int y =62;
	
		@Override
		public void area() {
			System.out.println("Area of Circle is PI*r*r");
		}
		
		public static void test() {
			System.out.println("test method Circle");
		}	
}
