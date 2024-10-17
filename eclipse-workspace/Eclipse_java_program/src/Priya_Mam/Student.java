package Priya_Mam;

public class Student {
	private String name;
	private int id;

	Student(){};
	
	Student(String name, int id){
		this.name = name;
		this.id= id;
	}
	
	public String toString() {
		return "Name "+ name + "\t"+ "Id "+ id ;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	
}
