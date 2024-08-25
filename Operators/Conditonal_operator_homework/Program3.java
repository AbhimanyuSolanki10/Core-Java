import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fist number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        System.out.println("Enter the four number");
        int d=sc.nextInt();
        System.out.println(a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d)));
        
        int big = a>b?a:b>c?a>b?a:b:c>d?a>b?a:b>c?a>b?a:b:c:d;
        System.out.println("Biggest number is : " + big);

    }
}