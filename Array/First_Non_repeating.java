class First_Non_repeating
{
	public static void main(String[] args)
	{
		int[] a={12, 13, 34, 12, 20, 12, 23, 34, 12, 20};
		System.out.println("First non repeating element is " +  firstnonrepeating(a));
	}
	public static int firstnonrepeating(int[] a){
		int[] freq=new int[101];
		for(int i=0;i<a.length;i++){
			freq[a[i]]++;
		}
		for(int i=0;i<a.length;i++){
			if(freq[a[i]]==1)
			{	
				return a[i];

			}
		}
		return -1;


	}
}