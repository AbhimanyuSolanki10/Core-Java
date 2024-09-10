package encapsulation;

public class Employ {
		private String name ;
		private int id;
		private double salary;
		
		public String getName() {
			//validation
			return name;
		}
		public int getId() {
			//validation
			return id;
		}
		public double getSalary() {
			//validation	
			return salary;
		}
		
		public void setName(String name) {
			//validation
			this.name=name;
		}
		public void setId(int id) {
			//validation		
			this.id=id;
		}
		public void setSalary(double salary) {
			//validation
			this.salary=salary;	
		}
}
