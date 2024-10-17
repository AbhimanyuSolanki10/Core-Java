class PrintEvenIndexValue
{
	public static void main(String[] args)
	{
		int[] a={12, 23, 30, 12, 43, 55, 60, 43};
		printEvenIndexValue(a);
	}
	public static void printEvenIndexValue(int[] a){
		System.out.println("ALl even Index elements are: ");
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				System.out.println(a[i]);
			}
		}
	}
}