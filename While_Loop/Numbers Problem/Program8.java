import java.util.Scanner;

class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        BiggestDigit(a);
    }

    public static void BiggestDigit(int a){
         int maxdigit = -1;
        while(a>0){
            int digit = a%10;
           
            if(digit>=maxdigit){
                maxdigit=digit;
             } 
            
            a= a/10;
        }
        System.out.print("The Biggest digit is " + maxdigit );
    }
}