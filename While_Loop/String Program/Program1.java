import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        int i=0;
        while(i<s1.length()){
            System.out.println(s1.charAt(i));
            i++;
        }
    }
}