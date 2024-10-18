import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=100;i++){
            if(i%10==7){
                System.out.println(i);
            }
        }
    }
}