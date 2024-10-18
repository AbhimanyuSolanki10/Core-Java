
class SecondSmallest {
    public static void main(String[] args) {
       int[] a = {80,80,30,12,45,12,60,43};
        getSmallestSecondSmallest(a);
    }
    public static void getSmallestSecondSmallest(int[] a){
        int smallest =a[0];
        int se_smallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                se_smallest=smallest;
                smallest=a[i];
            }else if(a[i]<se_smallest && a[i]!=smallest){
                se_smallest=a[i];
            }
        }
        System.out.println("Smallest is: " + smallest);
        System.out.println("SecondSmallest is: " + se_smallest);
    }
}