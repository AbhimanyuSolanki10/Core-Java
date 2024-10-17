package Priya_Mam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int ch;
		do {
			System.out.println("1.Add Student Details");
			System.out.println("2.Display Student Details");
			System.out.println("3.Search Student Details");
			System.out.println("4.Delete Student Details");
			System.out.println("5.Update Student Details");
			System.out.println("Enter Your Choice : ");
			ch=sc.nextInt();	
			
			switch (ch) {
			case 1:
				System.out.print("Enter the name ");
				String name = sc.next();
				System.out.print("Enter the Id ");
				int id = sc.nextInt();
				arr.add(new Student(name,id));
				
			break;
			case 2:
				System.out.println("=======================");
				Iterator<Student> i = arr.iterator();
				while(i.hasNext()) {
					Student s = i.next();
					System.out.println(s);
				}		
				System.out.println("=======================");
			break;
			case 3:
				boolean found = false;
				System.out.println("Enter Student Id to search");
				 id = sc.nextInt();
				System.out.println("=======================");
				 i = arr.iterator();
				while(i.hasNext()) {
					Student s = i.next();
					if(s.getId()== id) {
						System.out.println(s);
						found = true;
					}
				}		
				if(!found) {
					System.out.println("Record Not Found");
				}
				System.out.println("=======================");
				break;
			case 4:
				found = false;
				System.out.println("Enter Student Id to delete");
				id = sc.nextInt();
				System.out.println("=======================");
				i = arr.iterator();
				while(i.hasNext()) {
					Student s = i.next();
					if(s.getId()== id) {
						i.remove();
						found = true;
					}
				}		
				if(!found) {
					System.out.println("Record Not Found");
				}else {
					System.out.println("Record is Deleted Successfully ");
				}
				System.out.println("=======================");
				break;
			case 5:
				found = false;
				System.out.println("Enter Student Id to Update");
				id = sc.nextInt();
				System.out.println("=======================");
				ListIterator<Student> li = arr.listIterator();
				while(li.hasNext()) {
					Student s = li.next();
					if(s.getId()== id) {
						System.out.println("Enter New Name");
						name = sc.next();
						
						System.out.println("Enter New Id");
						id = sc.nextInt();
						
						li.set(new Student(name,id));
						
						found = true;
					}
				}		
				if(!found) {
					System.out.println("Record Not Found");
				}else {
					System.out.println("Record is Updated Successfully ");
				}
				System.out.println("=======================");
				break;
				
			}
		} while (ch!=0);
	}

	
}
