import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        CountEvenNumberOfDigits(a);
    }

    public static void CountEvenNumberOfDigits(int a){
        int count=0;
        while(a>0){
            int digit = a%10;
             if(digit%2==0){
             count++;
                
             } 
            
            a= a/10;
        }
        System.out.print("The number of Evendigit is " + count);
    }
}