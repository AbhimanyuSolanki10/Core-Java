import java.util.Scanner;

class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        FactOfEachDigit(a);

    }

    public static void  FactOfEachDigit(int a){
         
        while(a>0){
            int digit = a%10;
            
            System.out.println(digit+"!= " + fact(digit));
          
            a= a/10;
        }
    }

    public static int fact(int digit){
        int fact= 1;
        int i=1;
        while(i<=digit){
            fact = fact *i;
            i++;
        }
        return fact;
    }
}