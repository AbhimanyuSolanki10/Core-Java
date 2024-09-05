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
        int i=0;
        int n=s1.length()-1;
        while (i<n/2) { 
            if(s1.charAt(i)!=s1.charAt(n)){
                return false;
            }
            n--;
            i++;
        }return  true;
    }
}