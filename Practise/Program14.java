import java.util.Scanner;

class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("power " + pow(a,b) );
    }
    public static int pow(int a, int b){
        int res=1;
        for(int i=1;i<=b;i++){
            res = res*a;
        }
        return res;
    }
}