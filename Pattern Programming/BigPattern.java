import java.util.Scanner;

class BigPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int mid=n/2+1;
        int space=n/2;
        int sst=n+2;
        int est=2*n-1;
        int star=2*n+mid;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=mid;j++){  //Part-1
                if(j<=space)
                    System.out.print("  ");
                else    
                    System.out.print("* ");
            }
            for(int j=mid+1;j<=n+1;j++){  //Part-2
                if(i==1||j==n+1 && i<=mid)
                    System.out.print("@ ");
                else    
                    System.out.print("  ");
            }
            for(int j=n+2;j<=2*n-1;j++){  //Part-3
                if(i<=mid || j<sst || j>est)
                    System.out.print("  ");
                else    
                    System.out.print("* ");
            }
            for(int j=2*n;j<=5*n/2;j++){  //Part-4
                if(i==1 || j==2*n &&  i<=mid)
                    System.out.print("@ ");
                else    
                    System.out.print("  ");
            }
            for(int j=2*n+mid;j<=star;j++){  //Part-5
                    System.out.print("* ");
            }
        if(i<mid){
            space--; star++;
        }else{
            space++;  star--;
        }
        if(i>mid){
            sst++; est--;
        }
        System.out.println();
        }
    }

}