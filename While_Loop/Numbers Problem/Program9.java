import java.util.Scanner;

class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int a = sc.nextInt();
        System.out.println("Difference of big and small is : " + getDifference(a) );
    }

    public static int getDifference(int a){
         int big =0;
         int small =9;
        while(a>0){
            int rem = a%10;
           
            if(rem>big){
                big =rem;
             } 
            if(rem<small){
                small =rem;
             } 
            
            a= a/10;
        }
        return  big-small ;
    }
    
    
}