
class PrintNum {
    public static void main(String[] args) {
        printNum(1);
    }
    public static void printNum(int n){
        if(n<=100){
            System.out.println(n);
            printNum(n+1);
        }
    }
}