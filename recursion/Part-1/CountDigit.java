import java.util.Scanner;

class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        countDigit(n);
        System.out.println("total number are: "+ count);
    }
    static int count=0;
    public static void countDigit(int n){
        if(n>0){
            count++;
            countDigit(n/10);
        }
    }
}