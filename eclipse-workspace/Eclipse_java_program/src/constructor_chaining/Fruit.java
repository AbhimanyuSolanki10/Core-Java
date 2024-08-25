package constructor_chaining;

public class Fruit {
		String name ;
		int price;
		double weight;
		String color;
		
		Fruit(){
			
		}
		Fruit(String name){
			this();
			this.name=name;
			System.out.println("Fruit constructor with 1 argument called ");
		}
		Fruit(String name, int price){
			this(name);
			this.price=price;
			System.out.println("Fruit constructor with 2 argument called ");
		}
		Fruit(String name, int price , double weight){
			this(name,price);
			this.weight=weight;
			System.out.println("Fruit constructor with 3 argument called ");
		}
		Fruit(String name, int price , double weight ,String color){
			this(name,price,weight);
			this.color=color;
			System.out.println("Fruit constructor with 4 argument called ");
		}
		
		public void getDetails() {
			System.out.println("The name is : " + name );
			System.out.println("The price is : " + price );
			System.out.println("The weight is : " + weight );
			System.out.println("The color is : " + color );
		}
}
