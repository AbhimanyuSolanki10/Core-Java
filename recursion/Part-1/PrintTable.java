import java.util.Scanner;

class PrintTable {
    static int x = 0;
    public static void printTable(int n){
        x++;
        if(x<=10){
            System.err.println(n +"*" + x +  " = "+ n*x);
            printTable(n);
      }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        printTable(n);
    }
}