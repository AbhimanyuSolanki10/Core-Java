
class Factorial {
    public static void main(String[] args) {
        for(int i=1 ; i<=15;i++){
            System.out.println(i + "!=" +  getFactorial(i));
        }
    }

    public static int getFactorial(int n){
        int fact =1;
        for(int i=1; i<=n;i++)
            fact = fact * i;
        return fact;
    }
}