
import java.util.Scanner;

class Damru {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        printPatter(n);
    }

    public static void printPatter(int n) {
        int star = n;
        int space = 0;
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
                if (i < mid) {
                    star -= 2;
                    space++;
                } else {
                    star += 2;
                    space--;
                }
            System.out.println();
        }

    }
}
