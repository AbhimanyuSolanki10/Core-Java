package aggrigation;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1=new Address("Noida","Up",201301);
		Student s1=new Student("Mohan",112,a1);
		System.err.println("===============Address details==============");
		System.out.println(a1); 
		System.out.println(a1.city);
		System.out.println(a1.pin);
		System.out.println(a1.state);
		a1.getAddressDetails();
		System.err.println("===============Student details==============");
		System.out.println(s1); 
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		s1.getStudentDetails();
		System.err.println("===============Student Address details==============");
		System.out.println(s1.a.city);
		System.out.println(s1.a.pin);
		System.out.println(s1.a.state);
		s1.a.getAddressDetails();
	}

}
