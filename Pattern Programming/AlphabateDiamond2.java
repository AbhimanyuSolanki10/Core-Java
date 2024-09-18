import java.util.Scanner;

class AlphabateDiamond2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star =1; int space=n/2; char ch='A';
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print(ch+" ");
                
            }
        if(i<n/2+1){
            star+=2; space--;
        }else{
            star-=2; space++;
        }
        ch++;
        System.out.println();
        }
    }
}