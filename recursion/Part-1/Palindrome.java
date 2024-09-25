import java.util.Scanner;

class Palindrome {
    static  int rev=0;

    public static void reverse(int n){
        if(n>0){
            rev=10*rev+n%10;
            reverse(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        reverse(n);
        if(n==rev){
            System.out.println(n+" is Palindrome");
        }else
            System.out.println(n+" is Palindrome");
    }
}