import java.util.Scanner;

class Movezero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program start");
        int[] a = {7,0,2,6,0,4};
        movezero(a);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
    public static void movezero(int[] a){
        for(int i=0,j=0;i<a.length;i++){
            if(a[i]!=0){
                a[j]=a[i];
              if(i!=j){
                  a[i]=0;
              }
               j++;
            }
        }
    }
}