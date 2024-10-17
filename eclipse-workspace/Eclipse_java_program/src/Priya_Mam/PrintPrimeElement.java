package Priya_Mam;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintPrimeElement {
	public static void main(String[] args)
	{
		ArrayList arr = new ArrayList();
		
		ArrayList result =	printPrimeElement(arr);
		System.out.println(result);
	}
	public static ArrayList printPrimeElement(ArrayList arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		System.out.println("Enter the element");
		for(int i=0;i<size;i++) {
			arr.add(sc.nextInt());
		}
		ArrayList primelist = new ArrayList();
		
		for(int i=0;i<arr.size();i++) {
			Integer element = (Integer)arr.get(i);
			if(isPrime(element)) {
				primelist.add(element);
			}
		}
		return primelist;
	}
	
	public static boolean isPrime(int n) 
	{
		if(n<2) {
			return false;
		}
		for(int i=2;i<n/2;i++) {	
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	

}
