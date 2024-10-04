package exception_handling;

public class Registration {
	
	public static void checkEligiblity(int age) throws UnderAgeException {
		if(age>=18) {
			System.out.println("You are Eligible for Registration");
		}
		else
		{
			throw new UnderAgeException("You are Under Age");
		}
	}

}