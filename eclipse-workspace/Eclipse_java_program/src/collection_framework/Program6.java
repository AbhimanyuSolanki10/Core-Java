package collection_framework;
import java.util.*;
public class Program6 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(45);
		c1.add(44);c1.add(56);c1.add(100);c1.add(55);
		c1.add(200);
		
		Iterator itr=c1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}
}