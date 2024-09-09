package method_overriding;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Rectangle();
		Shape s2 = new Circle();
		Shape s3 = new Triangle();
		Circle obj =(Circle)new Shape();
		
		s1.area();
		s2.area();
		s3.area();
		obj.area();
	}

}
