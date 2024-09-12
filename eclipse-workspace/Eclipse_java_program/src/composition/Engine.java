package composition;

public class Engine {
	int hp ;
	public void start() {
		System.out.println("start the engine");
	}
	
	Engine(){
		
	}
	Engine(int hp){
		this.hp=hp;
	}
}
