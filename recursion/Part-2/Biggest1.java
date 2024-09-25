import java.util.Scanner;

class Biggest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt(); 
        int big=a; char c;
        do{
            System.out.println("Enter Next Number");
            int b=sc.nextInt();
            big=big(big,b);
            System.out.println("Press Y to enter next Number");
            c=sc.next().charAt(0);
        }while(c=='Y' || c=='y');
        System.out.println("Biggest value is : "+ big );
    }
    public static int big(int a,int b){
        return  a>b?a:b;
    }
}