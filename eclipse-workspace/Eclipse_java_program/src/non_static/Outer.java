package non_static;

public class Outer {
		int x=34;
		static int  z = 500;
		public void test() {
			System.out.println("test method of outer class");
		}
		
		class Inner 
		{
			int y =65;
			int z = 522;
			public void demo() {
				System.out.println("demo mehtod of inner class");
			}
		}
}
