
import java.util.Scanner;

class MaximumTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        maxtimes(arr);
    }
    public static void maxtimes(int[] arr) {
        int n = arr.length;
        int max = 0;
        int element = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = arr[n - 1];
                    n--;
                    j--;
                }
            }
            if (count > max) {
                max = count;
                element = arr[i];
                System.out.print(arr[i] + " ");

            }
        }
    }
}
