import java.util.Scanner;

class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        while(n>0){
            int digit = n%10;
            if(digit%2==1){
                System.out.println(digit);
            }
            n=n/10;
        }
    }
}