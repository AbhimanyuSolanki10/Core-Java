package has_a_relationship;

public class Engine {
	int hp;
	int strokes;
	String type;
	Engine(){
		
	}
	Engine(int hp,int strokes,String type){
		this.hp=hp;
		this.strokes=strokes;
		this.type=type;
	}
	public void getEngineDetails() {
		System.err.println("Engine HP is: " + hp);
		System.err.println("Engine Strokes is: " + strokes);
		System.err.println("Engine Type is: " + type);
	}

}
