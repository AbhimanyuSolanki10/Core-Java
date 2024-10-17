import java.util.Scanner;

class Rotate_Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size= sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("\n Element before Rotation: ");
        for(int x:a){
            System.out.print(x +" ");
        }
        rotateArray(a);
        System.out.println("\n Element after Rotation: ");
        for(int x:a){
            System.out.print(x +" ");
        }

    }
    public static void rotateArray(int[] a){
        int temp =a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            a[i+1]=a[i];
        }
        a[0]=temp;
    }

}