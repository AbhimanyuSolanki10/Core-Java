import java.util.Scanner;

class Even_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size= sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        exactly_once(arr);
    }
    public static void exactly_once(int[] arr){
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
           if(count%2==0)
            System.out.print(arr[i] +" ");
        }
    }
}