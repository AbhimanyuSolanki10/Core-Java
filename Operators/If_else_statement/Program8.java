import java.util.Scanner;

class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value ");
        char ch = sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Alphabat");
        }else if (ch>=0 && ch<=9){
            System.out.println("Digit");
        }else{
            System.out.println("Special character");

        }
    }
}