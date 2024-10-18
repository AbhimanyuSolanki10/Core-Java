import java.util.Scanner;

class Number13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum = 0;
        while(n>0){
            int digit = n%10;
          sum += factorial(digit);
            n=n/10;
        }
        System.out.println("sum "+ sum);
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact =fact * i;
        }
        return  fact;
    }
}