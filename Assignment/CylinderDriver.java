import java.util.Scanner;

class CylinderDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cylinder cy1=new Cylinder();
        System.out.println("Enter the Height of cylinder :");
        double h1=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Radius of cylinder :");
        double r1=sc.nextDouble();

        cy1.setValue(h1, r1);
        cy1.csa();
        cy1.tsa();
        cy1.volume();

    }
}