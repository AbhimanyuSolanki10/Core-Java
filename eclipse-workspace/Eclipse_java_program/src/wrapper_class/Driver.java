package wrapper_class;

public class Driver {
	public static void main(String[] args) {
		Test.checkData("abc547");
		System.out.println("===============");
		Test.checkData(238);
		System.out.println("===============");
		Test.checkData(45.6);
		System.out.println("===============");
		Test.checkData('@');
		System.out.println("===============");
		Test.checkData(true);
	}
}
