class Sum
{
	public static void main(String[] args)
	{
		int[] a={12, 23, 30, 12, 43, 55, 60, 43};
		int sum=getSum(a);
		System.out.println("Total Sum is: "+sum);
	}
	public static int getSum(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
	return sum;
	}
}