import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        if(isPerfectNumber(n))
            System.out.println (" is a Perfect Number");
        else
            System.out.println  (" is NOt a Perfect Number");
    }

    public static boolean isPerfectNumber(int n){
        int sum=0;
        for (int i = 0; i < n/2; i++) {
            if(n%i==0)
                sum = sum +i;
        }
        return  sum==n;
    }
}