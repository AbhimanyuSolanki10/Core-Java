import java.util.Scanner;

class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        if(isPalindrome(s1)){
            System.out.println(s1 + " is a  Palindrome");
        }else{
            System.out.println(s1 + " is Not a  Palindrome");

        }
    }


    public static boolean isPalindrome(String s1){
        String rev=""; 
        int i= 0;
        while (i<s1.length()) { 
            rev = s1.charAt(i) + rev;
            i++;
        }
        return s1.equalsIgnoreCase(rev);
    }

}