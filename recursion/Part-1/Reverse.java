
import java.util.Scanner;

class Reverse {
    static int rev=0;
    public static void reverse(int n) {
        if(n>0){
            int digit =n%10;
             rev=rev*10+digit;
            reverse(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        reverse(n);
        System.out.println("reverse is " + rev);
    }
}
