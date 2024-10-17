
import java.util.Scanner;

class OptimizeRightRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("\n Element before Rotation: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println("\n Enter Number of rotation");
        int n = sc.nextInt();
        rotateArray(a, n);
        System.out.println("\n Element after Rotation: ");
        for (int x : a) {
            System.out.print(x + " ");
        }

    }

    public static void rotateArray(int[] a, int k) {
        k = k % a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);

    }

    public static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

}
