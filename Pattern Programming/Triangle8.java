import java.util.Scanner;

class Triangle8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=n;
      
        for(int i=1;i<=n;i++){
           
            for(int j=1;j<=star;j++){
                System.out.print(i%2+" ");
            }
        star--;
      
        System.out.println();
        }
    }
}