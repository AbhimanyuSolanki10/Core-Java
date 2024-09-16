import java.util.Scanner;

class Damru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        printPattern(n);
    }
    public static void printPatter(int n){
        int star = n; int space =0;
        for(int i=1;i<=n;i++){
            System.out.println("  ");
        }
        for(int i=1;i<=n;i++){
            System.out.println("  ");
        }
    }
}