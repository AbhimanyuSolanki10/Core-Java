class Exactlly_once
{
	public static void main(String[] args)
	{
		int[] a={12, 15,12,18,20,12,15,12};
		Exactlly_once(a);
	}
	public static void Exactlly_once(int[] a){
		int[] freq=new int[101];
		for(int i=0;i<a.length;i++){
			freq[a[i]]++;
		}
		for(int i=0;i<freq.length;i++){
			if(freq[i]>=1)
				System.out.print(i+" ");
		}     
	}
}