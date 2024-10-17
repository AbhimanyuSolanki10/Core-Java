class PrintEven
{
	public static void main(String[] args)
	{
		int[] a={12, 23, 30, 12, 43, 55, 60, 43};
		printEven(a);
	}
	public static void printEven(int[] a){
		System.out.println("ALl even elements are: ");
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.println(a[i]);
			}
		}
	}
}