package wrapper_class;

public class Program5 {
	
	public static void main(String[] args) {
		Object o1="mohan is here";
		System.out.println(o1);
		String s1=(String)o1;
		System.out.println("Size is:" +s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
	}
}
