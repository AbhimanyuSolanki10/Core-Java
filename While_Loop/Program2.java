import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%10==7){
                System.out.println(i);
            }
            i++;
        }                      
    }
}