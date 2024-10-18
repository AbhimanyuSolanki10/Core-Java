import java.util.Scanner;

class Number15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev = 0; int o=n;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        if(rev==o)
          System.out.println("Yes");
        else
          System.out.println("No");
    }
}