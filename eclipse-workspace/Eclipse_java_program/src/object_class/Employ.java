package object_class;

public class Employ {
	String name;
	int id;
	double salary;
	
	Employ(){
		
	}
	
	Employ(String name ,int id ,double salary) {
			this.name=name;
			this.id=id;
			this.salary=salary;
	}
	  @Override
	  public String toString() {
	        return "the name is:" + name +"\t" + "Id is :" + id + "\t"+ "salary is :" + salary ;	
	    }
	  @Override
	  public int hashCode() {
		  return id;
	  }
	  @Override
	  public boolean equals(Object o) {
		  Employ e= (Employ)o;
		  return this.name.equals(e.name) &&
				  this.id==e.id &&
				  this.salary==e.salary;
	  }
	  @Override
	  public void finalize() {
		  System.out.println("Deatch system connection");
		  System.out.println("Deatch database connection");
		  System.out.println("Deatch newtwork connection");
		  System.out.println("============================");
	  }
}
