import java.util.Scanner;

class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st angle");
        double angle1 = sc.nextDouble();
        System.out.println("Enter the 2nd angle");
        double angle2 = sc.nextDouble();
        System.out.println("Enter the 3rd angle");
        double angle3 = sc.nextDouble();
        if(angle1+angle2+angle3==180){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
}