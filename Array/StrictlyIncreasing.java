import java.util.Scanner;
class StrictlyIncreasing
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++){
			System.out.print("Enter the Element "+(i+1)+": ");
			a[i]=sc.nextInt();
		}
		if(isStrictlyIncreasing(a))
			System.out.println("Array is Strictly Increasing");
		else
			System.out.println("Array is NOT Strictly Increasing");
	}
	public static boolean isStrictlyIncreasing(int[] a){
		for(int i=0;i<a.length-1;i++){
			if(a[i+1]<a[i])
				return false;
		}
	return true;
	}
}



