import java.util.Scanner;

class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print((i-1)%2+" ");
            }
            System.out.println();
        }
    }
}