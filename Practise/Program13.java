import java.util.Scanner;

class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("factorial is " + fact(n) );
    }
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact *i;
        }
        return fact;
    }
}