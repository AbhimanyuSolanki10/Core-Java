import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("Yes divisible");
        }else{
            System.out.println("NOt divisible");

        }
    }
}