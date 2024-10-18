import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=1000;i++){
            if(i%10==8 && i%8==0){
                System.out.println(i);
            }
        }
    }
}