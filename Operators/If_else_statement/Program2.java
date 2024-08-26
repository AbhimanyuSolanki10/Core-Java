
import java.util.Scanner;

class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        System.out.println("Enter the value of d");
        int d = sc.nextInt();
        if (a > b && a > c && a > d) {
            System.out.println(a + " is Greatest");
        } else if (b > a && b > c && b > d) {
            System.out.println(b + " is Greatest");
        } else if (c > a && c > b && c > d) {
            System.out.println(c + " is Greatest");
        }else{
            System.out.println(d + " is Greatest");

        }
    }
}
