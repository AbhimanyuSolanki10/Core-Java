import java.util.Scanner;

class RectangleDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.print("Enter the length of 1st Rectangel : ");
        double l1=sc.nextDouble();
        System.out.print("Enter the width of 1st Rectangel : ");
        double w1=sc.nextDouble();
        
        r1.setValue(l1, w1);
        r1.area();
        r1.perimeter();

        System.out.print("Enter the length of 2nd Rectange2 : ");
        double l2=sc.nextDouble();
        System.out.print("Enter the width of 2nd Rectange2 : ");
        double w2=sc.nextDouble();
        r2.setValue(l2, w2);
        r2.area();
        r2.perimeter();

        // r1.setValue(10, 5);
        // r1.area();
        // r1.perimeter();
        // r2.setValue(100, 55.6);
        // r2.area();
        // r2.perimeter();

    }
}