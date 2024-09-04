import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        printCharactersfromStart(s1);
        System.out.println("=======================================");
        printCharactersfromEnd(s1);
    }

    public static void printCharactersfromStart(String s1){
        int i=0;
        while(i<s1.length()){
            System.out.println(s1.charAt(i));
            i++;
        }
    }
    public static void printCharactersfromEnd(String s1){
        int i=s1.length()-1;
        while(i>=0){
            System.out.println(s1.charAt(i));
            i--;
        }
    }
}