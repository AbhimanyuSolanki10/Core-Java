import java.util.Scanner;

class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a =sc.nextInt();
        System.out.println("Enter the value of b");
        int b =sc.nextInt();
        System.out.println("Enter the value of c");
        int c =sc.nextInt();
        System.out.println((a+b)>c && (b+c)>a && (a+c)>b ? "Triangle is valid " : "Not valid");
    }
}