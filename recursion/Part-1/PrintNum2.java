
class PrintNum2 {
    public static void main(String[] args) {
        printNum(100);
    }
    public static void printNum(int n){
        if(n>0){
            System.out.println(n);
            printNum(n-1);
        }
    }
}