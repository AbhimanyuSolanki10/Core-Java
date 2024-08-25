import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a =sc.nextInt();
        System.out.println("Enter the second number : ");
        int b =sc.nextInt();
        System.out.println(a>b?a + " is greatest" : b + " is greatest");
    }
}