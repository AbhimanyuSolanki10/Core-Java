import java.util.Scanner;

class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        printPattern(n); 
    }

    public static void printPattern(int n){
        for(int i=1;i<=n+2;i++){
            for(int j = 1; j<=n;j++){
                System.out.print(i + " " );
            }
            System.out.println();
        }
    }
}