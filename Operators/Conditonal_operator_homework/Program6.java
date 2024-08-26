import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num%5==0 && num%11==0 ? "Is divisible": "Not divisible");
    }
}