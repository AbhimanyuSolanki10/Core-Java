import java.util.Scanner; 
class EmployDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employ e1= new Employ();
        System.out.println("Enter the name of 1st employ: " );
        String n1=sc.nextLine();
        System.out.println("Enter the Id of 1st employ: " );
        int id1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the salary of 1st employ: ");
        double s1=sc.nextDouble();
        System.out.println("Enter the total number of Days: ");
        int td=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the absent number of Days: ");
        int abd=sc.nextInt();
        

        e1.setValue(n1, id1, s1);
        e1.getDetails();
        e1.actualSalary(td, abd); 


    }

}