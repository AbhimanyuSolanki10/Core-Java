import java.util.Scanner;

class Triangle10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=1;
       
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=star;j++){
                System.out.print(j+" ");
            }
        star++;
     
        System.out.println();
        }
    }
}