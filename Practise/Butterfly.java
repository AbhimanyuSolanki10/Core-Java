import java.util.Scanner;

class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();
         int sst=1;
         int est=n;
        int mid = n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=sst || j>=est)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            if(i<mid){
                sst++; est--;
            }else{
                sst--; est++;
            }
        System.out.println();
        }
    }
}