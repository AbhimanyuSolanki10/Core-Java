import java.util.Scanner;

class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int small=9; int big =-1;
        while(n>0){
            int digit = n%10;
            if(digit<small)
                 small=digit;
            else if(digit>big)
                big=digit;
            n=n/10;
        }
        System.out.println(big-small);
    }
}