package object_class;

public class Driver {
	public static void main(String[] args) {
		Employ e1=new Employ("Mohan",123,45263.896);
		Employ e2=new Employ("Sohan",123,896559.65);
		Employ e3=new Employ("Mohan",123,45263.896);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("==========toString()===============");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println("==========hasCode()===============");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println("==========equals()===============");
		System.out.println(e1==e2);
		System.out.println(e1==e3);
		System.out.println("=====================================");
		System.out.println(e1.equals(e2));
		System.out.println(e3.equals(e3));
		
		
		
	}
}
