import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing Even Number upto 100");
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}