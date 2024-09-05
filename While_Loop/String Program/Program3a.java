import java.util.Scanner;

class Program3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        String rev =" ";
        int i=0;
        while(i<s1.length()){
            rev =  s1.charAt(i) + rev ;
            i++;
        }
        System.out.println("Reverser is : " + rev);
    }
}