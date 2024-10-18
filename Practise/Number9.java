import java.util.Scanner;

class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int pro=1;
        while(n>0){
            int digit = n%10;
            pro =pro*digit;
            n=n/10;
        }
        if(pro%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}