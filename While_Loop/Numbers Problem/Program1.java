import java.util.Scanner;
class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a=sc.nextInt();
        sc.close();

        getEachDigit(a);
        
    }

    public static void getEachDigit(int a){
        
        while(a>0){
            System.out.println(a%10);
            a= a/10;
        }
    }
}

