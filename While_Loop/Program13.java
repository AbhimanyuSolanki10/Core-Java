
class Program13 {
    public static void main(String[] args) {
        int i=1;
        int sum =0;
        while(i<100){
            sum +=i*((i+1)*(i+1)); 
            i++;
        }
        System.out.println("The sum of series is " + sum);
    }
}