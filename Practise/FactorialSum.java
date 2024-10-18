import java.util.Scanner;

class FactorialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for(int i=1;i<=10;i++){
            sum+=factorial(i);
        }
        System.out.println(sum);
    }
     public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
}