
import java.util.Scanner;

class Strong_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        
         if (StrongNumber(a) == a) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }

    }

    public static int StrongNumber(int a) {
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;
            sum = sum + fact(digit);
            a = a / 10;
        }
        System.out.println(sum);

       return  sum ;
    }

    public static int fact(int digit) {
        int fact = 1;
        int i = 1;
        while (i <= digit) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
