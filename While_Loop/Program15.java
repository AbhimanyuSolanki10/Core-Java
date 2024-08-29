
class Program15 {
    public static void main(String[] args) {
        int i=1;
        double sum =0;
        while(i<=100){
            sum += 1.0/i; 
            i++;
        }
        System.out.println("The sum of series is " + sum);
    }
}