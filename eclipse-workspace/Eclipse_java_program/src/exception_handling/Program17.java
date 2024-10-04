package exception_handling;

public class Program17 {
	public static void main(String[] args) {
		try {
			Program16.printNumber(6);
		}catch(Exception e) {
			System.out.println("Exception caught!");
		}
	}

}