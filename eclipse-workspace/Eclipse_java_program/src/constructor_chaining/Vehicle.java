package constructor_chaining;

public class Vehicle {
		Vehicle(){
			System.out.println("Vehicle Constructor with no Argument called");
		}
		
		Vehicle(int x){
			this();
			System.out.println("Vehicle Constructor int Argument x is : " + x );
		}
		
		Vehicle(int x , int y ){
			this(x);
			System.out.println("Vehicle Constructor int , int Argument x and y  is : " + x + " " + y );
		}
}
