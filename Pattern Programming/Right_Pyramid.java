
import java.util.Scanner;

class Right_Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int stars = 1;
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            if(i<mid){
                    stars++;
                }else{
                    stars--;
                }
        System.out.println();
        }

    }
}
