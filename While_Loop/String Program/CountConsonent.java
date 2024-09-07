import java.util.Scanner;

class CountConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1= sc.nextLine();
        countConsonent(s1);
    }
    public static void countConsonent(String s1){
        s1.toLowerCase();
        int i=0; 
        int count =0;
        while(i<s1.length()){
            char x = s1.charAt(i);
            if(x>=97 && x<=122){
                if(!(x=='a' || x=='e'|| x=='i' || x=='o' || x=='u'))
                    count++;
            }
            i++;
        }
        System.out.println("Total no of Consonents are: " + count);
    }

}