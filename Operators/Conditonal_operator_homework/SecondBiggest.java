import java.util.Scanner;

class SecondBiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c = sc.nextInt();

        System.out.print(a>b?(a>c?(c>b?c:b):a):(b>c?(c>a?c:a):b));
    }
}