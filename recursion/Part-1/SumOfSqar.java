import java.util.Scanner;

class SumOfSqar {

    static int x=0;
    public static void sumofsqr(int n){
        if(n>0){
            x=x+ (n*n);
            sumofsqr(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        sumofsqr(n);
        System.out.println("Sum of square of "+ n + " is "+ x);
    }
}