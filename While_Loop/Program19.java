class Program19{
    public static void main (String [] args){
        int i=1;
        double sum = 0;
        while(i<=100){
            if(i%2==1){
                sum = sum + 1.0/i;
            }else{
                sum = sum - 1.0/i;
            }
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}