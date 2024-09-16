import java.util.Scanner;

class V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int sst=1;
        int es=2*n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=es;j++){
                if(j==sst || j==es )
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
        sst++;
        es--;
        System.out.println();
        }

    }
}