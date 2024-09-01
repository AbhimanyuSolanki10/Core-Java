import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        PrintDigit(a);
    }

    public static void PrintDigit(int a){
        while(a>0){
            int digit = a%10;
            if(digit>5){
                System.out.println(digit);
            }
            a= a/10;
        }
    }
}