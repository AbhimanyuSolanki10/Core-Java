class Appeared_max_times
{
	public static void main(String[] args)
	{
		int[] a={12, 13, 34, 12, 20, 12, 23, 34, 12, 20};
		max_times(a);
	}
	public static void max_times(int[] a){
		int[] freq=new int[101];
		int max= 0;
		int element = a[0];
		for(int i=0;i<a.length;i++){
			freq[a[i]]++;
		}
		for(int i=0;i<freq.length;i++){
			if(freq[i]>max)
			{	max=freq[i];
				element = i;
			}
		}
		System.out.println("element with max freq is "+ element + " apperared " + max + " times");


	}
}