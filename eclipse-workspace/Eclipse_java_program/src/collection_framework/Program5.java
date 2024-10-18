package collection_framework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Program5 {
		public static void main(String[] args) {
			Collection c1=new ArrayList();
			c1.add(23);c1.add(23.45);c1.add("mohan");c1.add('@');c1.add(34);
			Iterator<Integer> itr =c1.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("Program Ends");
	}

}