import java.util.Scanner;

class Prime_number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        isPrime(n);
    }

    public static void isPrime(int n){
        int i=1;
        int counter = 0;
        while(i<=n){
            if(n%i==0){
                counter++;
            }
            i++;
        }
        if(counter==2){
            System.out.println("Is Prime");
        }else{
            System.out.println("Not a Prime");
        }
    }
}