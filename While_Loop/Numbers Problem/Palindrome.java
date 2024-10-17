
import java.util.Scanner;

class Program17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        
        if(Palindrome(a) == a){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not a Palindrom");

        }

    }

    public static int Palindrome(int a) {
            int no=0;
        while (a > 0) {
            int digit = a % 10;
            no = no*10 + digit;
            a = a / 10;
        }
        return no;

       
    }

   
}
