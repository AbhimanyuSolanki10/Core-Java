package multithreading;

public class Car extends Thread{
		public void run() {
			drive();
		}
		public void drive() {
			System.out.println("Drive starts");
			for(int i=1;i<=10;i++) {
				System.out.println("Car completes " + i +" KM");
			}
			System.out.println("Drive Ends");
		}
}
