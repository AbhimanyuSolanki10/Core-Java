import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int i=1;
        int count = 0;
        System.out.println("All  the factors of  " + n +" are Below");
        while(i<=n/2){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println("\nTotal number of factors are " + count);

    }
}