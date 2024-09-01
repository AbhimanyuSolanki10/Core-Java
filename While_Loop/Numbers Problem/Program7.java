import java.util.Scanner;

class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        CountOddNumberOfDigits(a);
    }

    public static void CountOddNumberOfDigits(int a){
        int count=0;
        while(a>0){
            int digit = a%10;
             if(digit%2==1){
             count++;
                
             } 
            
            a= a/10;
        }
        System.out.print("The number of Odddigit is " + count);
    }
}