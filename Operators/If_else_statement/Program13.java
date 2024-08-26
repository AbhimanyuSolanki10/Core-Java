import java.util.Scanner;
class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        double D = Math.pow(b,2) - (4*a*c) ;
        if(D>=0 && a!=0){
            double root1 = (-b + Math.sqrt(D)/(2*a));
            double root2 = (-b - Math.sqrt(D)/(2*a));
            System.out.println(root1 +  "and " + root2);
        }else{
            System.out.println("No Real root exist ");

        }

    }
}