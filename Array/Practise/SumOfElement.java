import java.util.Scanner;

class  SumOfElement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size =sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
      int sum =   SumOfElement(arr);
      System.out.println(sum);
    }
    public static int SumOfElement(int[] arr){
        int sum = 0;
        for(int p:arr){
            sum = sum + p;
        }
        return sum;
    }
}