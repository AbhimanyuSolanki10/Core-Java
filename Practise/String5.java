import java.util.Scanner;

class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        int i=s.length()-1; 
        int count=0;
        while(i>=0){
            if(s.charAt(i)==' '|| s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A'|| s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O' || s.charAt(i)=='U'  ){

            }
            else 
              count++;   
            i--; 
        }
            System.out.println("consonent are "+ count);

    }
}