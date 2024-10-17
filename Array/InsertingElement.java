
import java.util.Scanner;

class InsertingElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + " Number");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the  Index to Add element");
        int index = sc.nextInt();
        System.out.println("Enter the  value to Add element");
        int value = sc.nextInt();

        int[] updatedArr = insertElement(arr, index,value);
        for (int i = 0; i < updatedArr.length; i++) {
            System.out.print(" "+ updatedArr[i]);
        }
    }

    public static int[] insertElement(int[] arr, int index,int value) {
        int[] updatedArr = new int[arr.length + 1];
        for (int i = 0; i < updatedArr.length ; i++) {
            if (i == index) {
                updatedArr[i] = value;
            }else if(i>index)  {
                updatedArr[i] = arr[i-1]; 
            }else{
                updatedArr[i] = arr[i]; 

            }
        }
        return updatedArr;
    }
}
