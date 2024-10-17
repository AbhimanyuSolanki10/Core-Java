package Priya_Mam;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintElement {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		ArrayList result =	printElement(arr);
		System.out.println(result);
	}
	public static ArrayList printElement(ArrayList arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		System.out.println("Enter the element");
		for(int i=0;i<size;i++) {
			arr.add(sc.nextInt());
		}
		return arr;
		
	}
	
	

}
