import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        if(isPalindrome(s1)){
            System.out.println("Is Plindrome");
        }else{
            System.out.println("NOT palindrome");
        }
       
    }

    public static boolean  isPalindrome(String s1){
        s1=s1.toLowerCase();
        int i=0;
        int mid=s1.length()/2;
        while (i<mid) { 
            if(!(s1.charAt(i) == s1.charAt(s1.length()-1-i))){
                return false;
            }
            i++;
        }return  true;
    }
}