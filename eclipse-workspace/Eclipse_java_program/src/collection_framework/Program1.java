package collection_framework;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		System.out.println(c1);
		c1.add(23);
		System.out.println(c1.add(34));
		c1.add(23.45);
		c1.add("mohan");
		c1.add('@');
		System.out.println(c1);
		c1.add(44);
		c1.add(23);
		System.out.println(c1);
		c2.add(344);
		c2.add(200);
		c2.add(500);
		c2.add(450);
		System.out.println("c1 is: "+c1);
		System.out.println("c2 is: "+c2);
		c1.addAll(c2);
		System.out.println("Now c1 is: "+c1);
		c1.remove(23);
		c1.remove(1000);
		System.out.println("c1 is now: "+c1);
		

	}

}