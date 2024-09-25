import java.util.Scanner;
class DigitSum {
    static int sum=0;
    public static void digitSum(int n){
        if(n%10>0){
            sum=sum+n%10;
            digitSum(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        digitSum(n);
        System.out.println("sum is :" + sum);
    }
}