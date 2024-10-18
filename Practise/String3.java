import java.util.Scanner;

class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        int i=s.length()-1; 
        int start=0; 
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
            {
                System.out.println("Not Palindrome");
                return;
            }
            start++; end--;
        }
        System.out.println("Palindrome");

    }
}