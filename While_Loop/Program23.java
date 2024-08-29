
import java.util.Scanner;

class Program23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to Print n number of fibbonaci series ");
        int n = sc.nextInt();
        getFibbonaci(n);
    }

    public static void getFibbonaci(int n) {
        int i = 1;
        int first = 0;
        int second = 1;
        if(n<0){
            System.out.println("Entered Negative Number");
        }
        else if (n == 1 || n==0) {
            System.out.println(0);
        } 
        else if (n == 2) {
            System.out.print(0 + " " + i);
        }
        
    }
}
