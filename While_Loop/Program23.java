
import java.util.Scanner;

class Program23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = sc.nextInt();
        int i = 1;
        int first = 0;
        int second = 1;
        int next ;
        if(n==1){
            System.out.print(first + " ");
        }else if(n==2){
            System.out.print(first + " " + second + " ");
        }else{
            System.out.print(first + " " + second + " ");
            while(i<=n-2){
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            i++;

            }

        }
    }
}