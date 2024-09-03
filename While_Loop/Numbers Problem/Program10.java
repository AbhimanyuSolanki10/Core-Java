import java.util.Scanner;

class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        // evenOrOddProduct(a);
        if(evenOrOddProduct(a)){
            System.out.println(a + " has Even digit Product");
        }else{
            System.out.println(a + " has Odd digit Product");
        }

    }
        //todo   using without variable
        public static boolean  evenOrOddProduct(int a) {
            while(a>0){
                int rem = a%10;
                if(rem%2==0){
                    return true;
                }
                a=a/10;
            }
            return false;
        }


    //todo using product variable


    // public static void  evenOrOddProduct(int a){
         
    //     int product = 1;
    //     while(a>0){
    //         int digit = a%10;
    //         product *=digit;
          
    //         a= a/10;
    //     }
    //         if(product%2==0){
    //             System.out.println("Even");
    //         }else{
    //             System.out.println("Odd");
    //         }
        
    // }
   
}