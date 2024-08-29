
import java.util.Scanner;

class Prime_number3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n +" is a Prime Number");
        }else
            System.out.println(n +" is Not a Prime Number");
    }

    public static boolean isPrime(int n) {
        if(n<2) 
            return false;
        int i = 2;
        while (i *i <= n) {
            // System.out.println("Loop Execution is: " + (i-1));
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
