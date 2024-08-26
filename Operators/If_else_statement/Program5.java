import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        }else if (ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        }else{
            System.Out.println("NOT A ALPHABATE")
        }
    }

}