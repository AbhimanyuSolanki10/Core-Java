import java.util.Scanner;

class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        ProductOfAllEvenOdd(a);

    }

    public static void  ProductOfAllEvenOdd(int a){
         
        int product = 1;
        while(a>0){
            int digit = a%10;
            product *=digit;
          
            a= a/10;
        }
            if(product%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        
    }
   
}