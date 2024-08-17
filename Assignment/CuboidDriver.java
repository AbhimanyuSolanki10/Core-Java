import java.util.Scanner;

class CuboidDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cuboid c1= new Cuboid();

        System.out.println("Enter the the Length of cuboid : ");
        double l= sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the the Breadth of cuboid : ");
        double b= sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the the Height of cuboid : ");
        double h= sc.nextDouble();

        c1.setValue(l, b, h);    
        c1.tsa();
        c1.lsa();
        c1.vloume();
        c1.perimeter();
    }
}