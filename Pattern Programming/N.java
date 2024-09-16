import java.util.Scanner;

class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=n;
        int mid=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                if(j==1|| i==1 || i==n || i==mid && j!=n || j==n && i!=mid)
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
        System.out.println();
        }

    }
}