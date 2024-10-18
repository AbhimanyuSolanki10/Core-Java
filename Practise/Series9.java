import java.util.Scanner;

class Series9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum =0;
        for(int i=1;i<=3;i++){
            sum += 1.0/i*i;
        }
        System.out.println("sum is " + sum);
    }
}