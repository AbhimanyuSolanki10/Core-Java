import java.util.Scanner;

class Series7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for(int i=1;i<=2;i++){
            sum +=(i*i)*(i+1);
        }
        System.out.println("sum is " + sum);
    }
}