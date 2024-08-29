
class Program11 {
    public static void main(String[] args) {
        int i=1;
        int sum =0;
        while(i<=100){
            sum +=i*i*i*i; 
            i++;
        }
        System.out.println("The sum of series is " + sum);
    }
}