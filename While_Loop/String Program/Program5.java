import java.util.Scanner;

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        System.out.println("Total No of Vowels are : " + Vowels(s1));
    }

    public static int  Vowels(String s1){
        int i=0;
        int count =0;
        while(i<=s1.length()-1){
            if(s1.charAt(i) == 'a' || s1.charAt(i) =='e' || s1.charAt(i) =='i' ||s1.charAt(i) == 'o' ||s1.charAt(i) == 'u' || s1.charAt(i) =='A' ||s1.charAt(i) == 'E' ||s1.charAt(i) =='I' ||s1.charAt(i) =='O' ||s1.charAt(i) =='U'){
                count++;
            }
            i++;
        }
       return  count;    
    }
}