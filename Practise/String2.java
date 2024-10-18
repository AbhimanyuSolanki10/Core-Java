import java.util.Scanner;

class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        int i=s.length()-1; 
        String rev="";
        while(i>=0){
            System.out.print(s.charAt(i)+rev);
            i--;
        }

    }
}