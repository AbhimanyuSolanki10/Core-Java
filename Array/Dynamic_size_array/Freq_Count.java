import java.util.Scanner;

class Freq_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size= sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        countfreq(arr);
    }
    public static void countfreq(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 1;
           for(int j=i+1;j<n;j++){
               if(arr[i]== arr[j]){
                 count++;
                arr[j]=arr[n-1];
                n-- ; j--;
               }
           }
        System.out.println(arr[i] + " is : " + count + " times");
        }
    }
}