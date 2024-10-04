package exception_handling;

public class Program14 {
	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println("i is: "+i);
				Thread.sleep(800);
		}
	}

}