package collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program7 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(45);
		c1.add(44);c1.add(56);c1.add(100);c1.add(55);
		c1.add(200);
		System.out.println("C1 is: "+c1);
		Iterator itr=c1.iterator();
		while(itr.hasNext()) {
			int x=(Integer)itr.next();
			if(x%2==1)
				itr.remove();
		}
		System.out.println("new c1 is: "+c1);
		
	}

}