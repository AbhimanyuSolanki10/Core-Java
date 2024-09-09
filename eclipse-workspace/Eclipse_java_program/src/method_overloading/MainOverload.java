package method_overloading;

public class MainOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main with String[] ");
		main(23.5);
		main(34);
		main("abv");
	}
	public static void main(int args) {
		// TODO Auto-generated method stub
		System.out.println("Main with int ");
	}
	public static void main(double args) {
		// TODO Auto-generated method stub
		System.out.println("Main with double ");
	}
	public static void main(boolean args) {
		// TODO Auto-generated method stub
		System.out.println("Main with boolean ");
	}
	public static void main(String args) {
		// TODO Auto-generated method stub
		System.out.println("Main with String ");
	}

}
