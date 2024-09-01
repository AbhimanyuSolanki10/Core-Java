import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        PrintOddDigits(a);
    }

    public static void PrintOddDigits(int a){
        while(a>0){
            int digit = a%10;
            if(digit%2==1){
                System.out.println(digit);
            }
            a= a/10;
        }
    }
}