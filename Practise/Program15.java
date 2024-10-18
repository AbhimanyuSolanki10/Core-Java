
import java.util.Scanner;

class Program15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term ");
        int n = sc.nextInt();
        fibo(n);
    }

    public static void fibo(int n) {
        int first = 0;
        int second = 1;
        int third;
        if (n == 1) {
            System.out.print(first + " ");
        } else if (n == 2) {
            System.out.print(first + " " + second + " ");
        } else {
            System.out.print(first + " " + second + " ");
            while (n-2>0) {
                third = first + second;
                System.out.print(third + " ");
                first = second;
                second = third;
                n--;
            }
        }
    }
}
