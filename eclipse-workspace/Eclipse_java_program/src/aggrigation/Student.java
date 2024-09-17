package aggrigation;

public class Student {
		String name;
		int rollno;
		Address a;
		
		Student(){
			
		}
		Student(String name,int rollno ,Address a){
			this.name=name;
			this.rollno=rollno;
			this.a=a;
		}
		public void getStudentDetails() {
			System.out.println("Name is " + name);
			System.out.println("ROll no name is " + rollno);
		}
}
