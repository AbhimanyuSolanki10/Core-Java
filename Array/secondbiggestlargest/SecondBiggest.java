
class SecondBiggest {
    public static void main(String[] args) {
       int[] a = {80,80,30,12,45,55,60,43};
        getBiggestSecondBiggest(a);
    }
    public static void getBiggestSecondBiggest(int[] a){
        int biggest =a[0];
        int se_biggest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>biggest){
                se_biggest=biggest;
                biggest=a[i];
            }else if(a[i]>se_biggest && a[i]!=biggest){
                se_biggest=a[i];
            }
        }
        System.out.println("Biggest is: " + biggest);
        System.out.println("SecondBiggest is: " + se_biggest);
    }
}