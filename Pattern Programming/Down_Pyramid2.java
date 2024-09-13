import java.util.Scanner;

class Down_Pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n){
        int stars=n;
        int space=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*   ");
            }
        stars--; 
        space++;
        System.out.println();
        }

    }
}