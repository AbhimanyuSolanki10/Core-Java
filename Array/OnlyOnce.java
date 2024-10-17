class OnlyOnce
{
	public static void main(String[] args)
	{
		int[] a={12, 13, 34, 12, 20, 12, 23, 34, 12, 20};
		printfrequencyOnlyOnce(a);
	}
	public static void printfrequencyOnlyOnce(int[] a){
		int[] freq=new int[101];
		for(int i=0;i<a.length;i++){
			freq[a[i]]++;
		}
		for(int i=0;i<freq.length;i++){
			if(freq[i]==1)
				System.out.print(i+" ");
		}
	}
}