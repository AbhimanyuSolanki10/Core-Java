
import java.util.Scanner;

class Program16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        
        Reverse(a);

    }

    public static void Reverse(int a) {
     
        while (a > 0) {
            int digit = a % 10;
            System.out.print(digit);

            a = a / 10;
        }

       
    }

   
}
