package interface_part;

public class ElectricCar implements Car {
		
	
		@Override
		public void start() {
			System.out.println("start the Electric Car");
		}
		@Override
		public void stop() {
			System.out.println("stop the Electric Car");
		}
		
		@Override
		public void openGate() {
			System.out.println("Open gate in Electric Car");
		}
}
