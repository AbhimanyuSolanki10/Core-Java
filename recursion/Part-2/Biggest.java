import java.util.Scanner;

class Biggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();
        System.out.println("Enter d:");
        int d=sc.nextInt();
        System.out.println("Enter e:");
        int e=sc.nextInt();
        int biggest=big(big(big(a,b),c), big(d,e));
        System.out.println("Biggest value is: " + biggest);
    }
    public static int big(int a,int b){
        return a>b?a:b;
    }
}