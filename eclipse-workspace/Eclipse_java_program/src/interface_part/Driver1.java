package interface_part;

public class Driver1 {
	public static void main(String[] args) {
		WebDriver1 wd =new ChromeDriver();
		TakeScreenshot1 ts=(TakeScreenshot1)wd;
		ChromeDriver cd =(ChromeDriver)wd;
		cd.getScreenshot();
		cd.drive();
		cd.start();
		
	}
}
