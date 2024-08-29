import java.util.Scanner;

class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        getPower(a,b);
    }

    public static void getPower(int a, int b){
        int i =1;
        int result =1;
        while(i<=b){
          result    = result   * a;
          i++;
        }
        System.out.println("The value of " + a + " power " + b +" is :" + result);
    }
}