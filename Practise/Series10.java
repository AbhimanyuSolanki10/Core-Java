import java.util.Scanner;

class Series10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for(int i=1;i<=4;i++){
            if(i%2==0){
               
                sum = sum -i;
            }else{
                sum= sum +i;
            }
        }
        System.out.println("sum is " + sum);
    }
}