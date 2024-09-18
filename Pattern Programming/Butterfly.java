import java.util.Scanner;

class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n){
        int sst=1 ; int est=n; 
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){
                if(j<=sst || j>=est){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
        if(i<n/2+1){
            sst++; est--;
        }else{
            sst--; est++;
        }
           
        System.out.println();
        }
    }
}