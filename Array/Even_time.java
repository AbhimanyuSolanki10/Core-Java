class Even_time
{
	public static void main(String[] args)
	{
		int[] a={12, 13, 34, 12, 20, 12, 23, 34, 12, 20};
		Even_time(a);
	}
	public static void Even_time(int[] a){
		int[] freq=new int[101];
		for(int i=0;i<a.length;i++){
			freq[a[i]]++;
		}
		for(int i=0;i<freq.length;i++){
			if(freq[i]%2==0 && freq[i]>0)
				System.out.print(i+" ");
		}
	}
}