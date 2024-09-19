package interface_part;

public class RemoteWebDriver1 implements JavaScriptExecutor1,WebDriver1,TakeScreenshot1 {
		public void executeScript() {
			System.out.println("execute script is implemented");
		}
		public void get() {
			System.out.println("get method is implented");
		}
		public void getScreenshot() {
			System.out.println("Screenshot is implemented");
		}
		public void findElement() {
			System.out.println("Find Element is implemented");
		}
		public void test() {
			System.out.println("test method of Remote Web Driver");
		}
}
