package collection_framework;
import java.util.ArrayList;
import java.util.Collection;
public class Program2 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(23.45);
		c1.add("mohan");
		c1.add('@');
		c1.add(34);
		System.out.println(c1.contains(34));
		System.out.println(c1.contains(100));
		System.out.println("size is: "+c1.size());
		System.out.println(c1.hashCode());
		
	}

}