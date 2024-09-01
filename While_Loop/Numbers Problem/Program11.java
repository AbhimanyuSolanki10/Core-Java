import java.util.Scanner;

class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        SumOfEachDigit(a);

    }

    public static void  SumOfEachDigit(int a){
         
        int sum = 0;
        while(a>0){
            int digit = a%10;
            sum +=digit;
          
            a= a/10;
        }
        System.out.println("Sum of all digits is: " + sum);   
    }
}