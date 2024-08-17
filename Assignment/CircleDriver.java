import java.util.Scanner;

class CircleDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 =new Circle();
        System.out.println("Enter the Radius of circle: " );
        double r1=sc.nextDouble();

        c1.setValue(r1);   
        c1.area();
        c1.perimeter();

    }
}