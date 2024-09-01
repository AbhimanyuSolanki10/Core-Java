import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        PrintEventDigits(a);
    }

    public static void PrintEventDigits(int a){
        while(a>0){
            int digit = a%10;
            if(digit%2==0){
                System.out.println(digit);
            }
            a= a/10;
        }
    }
}