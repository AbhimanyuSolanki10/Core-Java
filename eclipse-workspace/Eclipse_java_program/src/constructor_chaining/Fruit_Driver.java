package constructor_chaining;

public class Fruit_Driver {
		public static void main(String[] args) {
			Fruit f1 = new Fruit("Apple",180,3.2);
			f1.getDetails();
			Fruit f2 = new Fruit("Mango",100,4.2,"yellow");
			f2.getDetails();
		}
		
		
}
