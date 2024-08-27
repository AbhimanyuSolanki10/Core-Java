package Copy_constructor;

public class Fruit_driver {
		public static void main(String[] args) {
			Fruit f1 = new Fruit("Mango",120,2.8);
			Fruit f2 = new Fruit("Apple",180,1.8);
			Fruit f3 = new Fruit("Grapes",100,1.8);
			Fruit f4 = new Fruit("Orange",160,5.8);
			Fruit f5 = new Fruit("Pinapple",220,1.8);
			
			Fruit f6 = new Fruit(f3);
			Fruit f7 = new Fruit(f2);
			Fruit f8 = new Fruit(f1);
			Fruit f9 = new Fruit(f4);
			Fruit f10 = new Fruit(f5);
			
			f6.DisplayDetails();
			f7.DisplayDetails();
			f8.DisplayDetails();
			f9.DisplayDetails();
			f10.DisplayDetails();
			 
			
		}
}
