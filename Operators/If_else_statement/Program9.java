import java.util.Scanner;

class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        }else{
            System.out.println("Not a Charactrer");
        }
    }
}