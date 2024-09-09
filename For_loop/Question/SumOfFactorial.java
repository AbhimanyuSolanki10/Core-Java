
class SumOfFactorial {
    public static void main(String[] args) {
       int sum = 0;
       for(int i=1;i<=10;i++){
            sum = sum + getFactorial(i);
        System.out.println("Sum is :" + sum);
       }
    }
      public static int getFactorial(int n){
        int fact =1;
        for(int i=1; i<=n;i++)
            fact = fact * i;
        return fact;
    }
}