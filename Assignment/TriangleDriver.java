import java.util.Scanner;

class TriangleDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t1=new Triangle();
        System.out.println("Enter the first side of triangle  :");
        double a=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the second side of triangle  :");
        double b=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the third side of triangle  :");
        double c=sc.nextDouble();
        

        t1.setValue(a, b, c);       
        t1.getArea();
        t1.perimeter();
        

        

    }
}

