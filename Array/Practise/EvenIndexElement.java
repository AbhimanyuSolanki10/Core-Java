import java.util.Scanner;

class EvenIndexElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size =sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printEvenIndexElement(arr);
    }
    public static void printEvenIndexElement(int[] arr){
        for(int i=0;i<=arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+"\t");
            }
        }
    }
}