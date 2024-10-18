import java.util.Scanner;

class UptoTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
               for(int j=1;j<=10;j++){
                System.out.println(i+" * " + j + " = "+ i*j );
            }
            System.out.println("==================================");
        }
    }
}