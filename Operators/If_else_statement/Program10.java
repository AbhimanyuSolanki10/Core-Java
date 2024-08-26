import java.util.Scanner;

class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
        if((a+b)>c && (a+c)>b && (b+c)>a ){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }

    }
}