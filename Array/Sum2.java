//sum divisible by 4 or not
class Sum2
{
	public static void main(String[] args)
	{
		int[] a={12, 24, 30, 12, 45, 55, 60, 43};
		boolean result=checkSum(a);
		if(result)
			System.out.println("Sum is divisible by 4");
		else
			System.out.println("Sum is NOT divisible by 4");
	}
	public static boolean checkSum(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		System.out.println("Sum is: "+sum);
	return sum%4==0;
	}
}