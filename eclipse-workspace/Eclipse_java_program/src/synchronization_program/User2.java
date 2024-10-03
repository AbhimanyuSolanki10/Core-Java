package synchronization_program;

public class User2  extends Thread{
	Table t;
	User2(){
		
	}
	User2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(30);
	}
}
