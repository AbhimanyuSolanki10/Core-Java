import java.util.Scanner;

class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
        if((a==b) && (b==c) && (c==a)){
            System.out.println("Equilateral Triangle");
        }else if((a==b) || (b==c) || (c==a) ){
            System.out.println("Isosceles Triangle");
        }else{
            System.out.println("Scalene Triangle:");
        }
    }
}