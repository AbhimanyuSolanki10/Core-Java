import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        String rev ="";
        int i=s1.length()-1;
        while(i>=0){
            rev = rev + s1.charAt(i);
            i--;
        }
        System.out.println("Reverser is : " + rev);
    }
}