package constructor;

public class Employ {
String name;
int id;
double salary;
Employ(){
	
}
Employ(String name){
	this.name=name;
}
Employ(String name , int id){
	this.name=name;
	this.id=id;
}
Employ(String name ,int id , double salary){
	this.name=name;
	this.id=id;
	this.salary=salary;
	
}

public void getDetails() {
System.out.println("name is : " + this.name);
System.out.println("Id is : " + this.id);
System.out.println("Salary is : " + this.salary);
}
}
