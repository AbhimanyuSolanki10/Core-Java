
import java.util.Scanner;


class Sum {
    static int sum=0;
    public static void calculatesum(int n){
        if(n>0){
            sum=sum+n;
            calculatesum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        calculatesum(n);
        System.out.println("sum of "+ n +" is " +sum);
    }
}