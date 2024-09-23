
import java.util.Scanner;

class Factorial {

    public static int calculateFactorial(int n) {
        if (n <= 1) 
            return 1;
      
        return n * calculateFactorial(n - 1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int res = calculateFactorial(n);
        System.err.println(res);

    }
}
