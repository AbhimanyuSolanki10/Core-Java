import java.util.Scanner;

class Mix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int mid=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==mid || j==mid || i==1 || i==n ||j==1 ||j==n || i==j || (i+j)==n+1)
                    System.out.print("* ");
                else    
                    System.out.print("  ");
            }
        System.out.println();
        }
    }
}