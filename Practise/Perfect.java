import java.util.Scanner;

class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println(isPerfect(n));
    }
    public static boolean isPerfect(int n){
        int o=n; int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0)
              sum= sum + i ;
        }
        if(o==sum){
            return true;
        }else
            return  false;
    }
}