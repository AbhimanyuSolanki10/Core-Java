import java.util.Scanner;

class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int i=2;
        int count=0;
        while(i<=n/2){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==0){
        System.out.println("Prime");
        }else{
        System.out.println("Not a Prime");

        }
}
}