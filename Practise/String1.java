import java.util.Scanner;

class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        int i=0;
        while(i<s.length()){
            System.out.println(s.charAt(i)+" ");
            i++;
        }

    }
}