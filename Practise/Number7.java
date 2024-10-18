import java.util.Scanner;

class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int big=-1;
        while(n>0){
            int digit = n%10;
            if(digit>big)
                 big=digit;
            n=n/10;
        }
        System.out.println(big);
    }
}