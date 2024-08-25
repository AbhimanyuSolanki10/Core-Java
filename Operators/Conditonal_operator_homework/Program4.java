import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char c =sc.next().charAt(0);
        System.out.println(c>='a' && c<='z' || c>='A' && c<='Z' ? "Alphabte" : "Not Alphabte");
        // System.out.println(c>=(char)97 && c<=(char)122 || c>=(char)65 && c<=(char)90);
    }
}