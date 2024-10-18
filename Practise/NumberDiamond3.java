import java.util.Scanner;

class NumberDiamond3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();
         int star=1;
        int space=n/2;
        int mid = n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print(i%2+" ");
            }
            if(i<mid){
                star+=2; space--;
            }else{
                space++; star-=2;
            }
        System.out.println();
        }
    }
}