import java.util.Scanner;

class EvenElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size =sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printEvenElement(arr);
        
    }
    public static void printEvenElement(int[] arr){
        for(int p:arr){
            if(p%2==0){
                System.out.print(p+"\t");
            }
        }
    }
}