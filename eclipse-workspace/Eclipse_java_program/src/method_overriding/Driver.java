package method_overriding;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Rectangle();
		Shape s2 = new Circle();
		Shape s3 = new Triangle();
		
		
		s1.area();
		s2.area();
		s3.area();
		System.out.println("========================================");
		s1.test();
		s2.test();
		s3.test();
		System.out.println("========================================");
		System.out.println(s1.x+ " " + s1.y);
		System.out.println(s2.x+ " " + s2.y);
		System.out.println(s3.x+ " " + s3.y);
	}

}
