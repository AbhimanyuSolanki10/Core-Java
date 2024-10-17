
import java.util.Scanner;

class RemoveElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + " Number");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Removing Index");
        int index = sc.nextInt();

        int[] updatedArr = removeElement(arr, index);
        for (int i = 0; i < updatedArr.length; i++) {
            System.out.print(" "+ updatedArr[i]);
        }
    }

    public static int[] removeElement(int[] arr, int index) {
        int[] updatedArr = new int[arr.length - 1];
        for (int i = 0; i < updatedArr.length ; i++) {
            if (i < index) {
                updatedArr[i] = arr[i]; 
            }else {
                updatedArr[i] = arr[i + 1];
            }
        }
        return updatedArr;
    }
}
