import java.util.Scanner;
class StringArray4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size=sc.nextInt();
		sc.nextLine();
		String[] a=new String[size];
		for(int i=0;i<a.length;i++){
			System.out.print("Enter the String "+(i+1)+": ");
			a[i]=sc.nextLine();
		}
		String biggest=getBiggestString(a);
		System.out.println("\nBiggest String is: "+biggest);
	}
	public static String getBiggestString(String[] a){
		String biggest="";
		for(String p: a){
			if(p.length()>biggest.length()){
				biggest=p;
			}
		}
	return biggest;
	}
}