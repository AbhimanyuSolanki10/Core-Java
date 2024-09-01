import java.util.Scanner;

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        CountNumberOfDigits(a);
    }

    public static void CountNumberOfDigits(int a){
        int count=0;
        while(a>0){
            int digit = a%10;
             if(digit>=0){
             count++;
                
             } 
            
            a= a/10;
        }
        System.out.print("The number of digit is " + count);
    }
}