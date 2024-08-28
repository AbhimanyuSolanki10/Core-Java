import java.util.Scanner;

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int i=1;
        while(i<=n/2){
            if(n%i==0){
                System.out.println("factors of " + n + " is "+ i);
            }
            i++;
        }

    }
}