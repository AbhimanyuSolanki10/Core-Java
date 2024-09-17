package aggrigation;

public class Address {
	String city;
	String state;
	int pin;
	Address(){
		
	}
	Address(String city ,String state , int pin){
		this.city=city;
		this.state=state;
		this.pin=pin;
		
	}
	public void getAddressDetails() {
		System.out.println("City name is " + city);
		System.out.println("State name is " + state);
		System.out.println("PIN is " + pin);
	}
}
