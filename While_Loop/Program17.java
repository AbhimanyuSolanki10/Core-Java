
class Program17 {
    public static void main(String[] args) {
        int i=1;
        double sum =0;
        while(i<=100){
            if(i%2==1){
                sum += i;
            }else{
                sum -= i;
            }
            i++;
        }
        System.out.println("The sum of series is " + sum);
    }
}