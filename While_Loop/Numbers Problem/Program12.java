import java.util.Scanner;

class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        SumOfEvenDigit(a);

    }

    public static void  SumOfEvenDigit(int a){
         
        int sum = 0;
        while(a>0){
            int digit = a%10;
            if(digit%2==0){
                sum +=digit;
            }
          
            a= a/10;
        }
        System.out.println("Sum of Even digits is: " + sum);   
    }
}