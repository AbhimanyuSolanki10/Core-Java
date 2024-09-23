import java.util.Scanner;

class Power {
    public static int calculatePower(int a,int b){
        if(b>0){
            return a*calculatePower(a, b-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int res=calculatePower(a,b);
        System.err.println(res);
    }
}