import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        int i=s1.length()-1;
        while(i>=0){
            System.out.println(s1.charAt(i));
            i--;
        }
    }
}