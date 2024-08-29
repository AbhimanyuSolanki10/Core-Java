import java.util.Scanner;

class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        getFactorial(n);
    }

    public static void getFactorial(int n){
        int i=1;
        int fact=1;
        while(i<=n){
             fact = fact * i;
            i++;
        }
            System.out.println("Factorial of " + n  + "! is : " + fact) ;
    }
}