package exception_handling;

public class Program13 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("i is: "+i);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}