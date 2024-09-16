import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        printPatter(n);
    }

    public static void printPatter(int n){
        int star=n;
        int mid=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                if(i==1 || i==n || i==mid || j==1)
                    System.out.print("* ");
            }
        System.out.println(); 
        }

    }
}