import java.util.Scanner;

public class ConditionalStatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = s.charAt(0);
        if(ch>='a' && ch <='z'){
            System.out.println("entered character is lowercase");
        }
        else if (ch>='A'&& ch<='z'){
            System.out.println("entered character is uppercase");
            
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("entered character is digitcharacter");
        }
        else{
            System.out.println("entered character is specialsymbol");
        }
    
    }
}