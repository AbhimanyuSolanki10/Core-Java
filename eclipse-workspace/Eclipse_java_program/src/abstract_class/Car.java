package abstract_class;

public  abstract class Car extends Vehicle{
	int hp;
	public abstract void openGate() ;
	public abstract void musicPlayer() ;
	
	public void light() {
		System.out.println("Swtich on the light");
	}
	public void horn() {
		System.out.println("on the horn");
	}
	Car(){
		
	}
	Car(String name , double price ,int hp){
		super(name,price);
		this.hp=hp;
	}
	
}
