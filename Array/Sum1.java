//sum divisible by 4 or not
class Sum1
{
	public static void main(String[] args)
	{
		int[] a={12, 23, 30, 12, 45, 55, 60, 43};
		checkSum(a);
	}
	public static void checkSum(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		if(sum%4==0)
			System.out.println("Sum "+sum+" is divisible by 4");
		else
			System.out.println("Sum "+sum+" is NOT divisible by 4");

	}
}