package composition;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Car c1 = new Car("TATA");
		     //System.out.println(c1);
		     //System.out.println(c1.name); 
		     //System.out.println(c1.e);
		     //System.out.println(c1.e.hp); 
		     //c1.e.start();
		     //System.out.println("=====================================");
		     //c1=null;
		     //System.out.println(c1);
		     //System.out.println(c1.name); 
		     //System.out.println(c1.e);
		     //System.out.println(c1.e.hp); 
		     //c1.e.start();
		
		Car c4 = new Car("Audi",new Engine(200));
		System.out.println(c4);
		System.out.println(c4.name);
		System.out.println(c4.e);
		System.out.println(c4.e.hp);
		c4.e.start();
		 
	}

}
