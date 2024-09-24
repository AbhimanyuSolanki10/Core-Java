package singleton;

public class Car {
	public static Car c= null;
	private Car() {
		
	}
	public static Car getInstance() {
		if(c==null) 
		{
		  c=new Car();
		  return c;
		}
	return c;
	}
}
