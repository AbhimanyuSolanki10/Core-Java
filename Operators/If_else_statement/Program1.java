import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+ " is Greatest");
        }else if(c>b && c>a ){
            System.out.println(c+ " is Greatest");

        }else {
            System.out.println(b + " is Greatest");
        }
    }
}