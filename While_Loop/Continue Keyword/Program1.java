import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= 1;
        while(i<=10){
            System.out.print("ABABABABABABABABABABABAB");
                if(i==5)
                    continue;
                System.out.println(i);
                i++;
        }
    }
}