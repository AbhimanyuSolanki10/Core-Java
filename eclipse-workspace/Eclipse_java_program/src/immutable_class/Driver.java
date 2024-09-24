package immutable_class;

public class Driver {
		public static void main(String[] args) {
			Laptop l1=new Laptop("Dell",52110.3,8);
			System.out.println(l1.getName());
			System.out.println(l1.getPrice());
			System.out.println(l1.getRam());
		}
}
