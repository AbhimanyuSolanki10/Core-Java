import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        for(int i=1000;i<=2000 ;i++){
            if(i%7==0 && i%10==7){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count is " + count);
    }
}