import java.util.Scanner;

class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        System.out.println("The differnce of Biggest and smallest digit is " + (biggest(a)-smallest(a)));
    }

    public static int biggest(int a){
         int maxdigit = -1;
        while(a>0){
            int digit = a%10;
           
            if(digit>=maxdigit){
                maxdigit=digit;
             } 
            
            a= a/10;
        }
        return  maxdigit ;
    }
    public static int smallest(int a){
         int mindigit = 10000000;
        while(a>0){
            int digit = a%10;
           
            if(digit<=mindigit){
                mindigit=digit;
             } 
            
            a= a/10;
        }
        return  mindigit ;
    }
}