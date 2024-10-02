package exception_handling;

public class Driver1 {
	public static void main(String[] args) {
		System.out.println("program Starts");
		int x=12; int y=0;
		try {
			Test.getResult(x, y);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program Ends!!");
	}

}