import java.util.Scanner;

class Prime_number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int i=2;
        int count=0;
        while(i<=n/2){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==0){
            System.out.println("Is Prime Number");
        }else{
            System.out.println("Is Not a Prime Number");
        }
    }
}