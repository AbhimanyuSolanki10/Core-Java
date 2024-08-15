class EmployDriver {
    public static void main(String[] args) {
        Employ e1 = new Employ();
        Employ e2 = new Employ();
        Employ e3 = new Employ();

        e1.setValue("Mohan", 123, 34647.57);
        e2.setValue("Sohan", 103, 34647.57);
        e3.setValue("Rohan", 173, 65247.57);
        System.out.println("==============================================================");
        System.out.println("Employ1  Object address is : " +e1);
        System.out.println("Employ1  Name address is : " + e1.name);
        System.out.println("Employ1  Id address is : " + e1.id);
        System.out.println("Employ1  salary address is : " + e1.salary);
        System.out.println("===========Employ2========================");
        System.out.println("Employ2  Name address is : " + e2.name);
        System.out.println("Employ2  Id address is : " + e2.id);
        System.out.println("Employ2  Object address is : " +e2);
        System.out.println("Employ2  salary address is : " + e2.salary);
        System.out.println("===========Employ3========================");
        System.out.println("Employ3  Name address is : " + e3.name);
        System.out.println("Employ3  Id address is : " + e3.id);
        System.out.println("Employ3  Object address is : " +e3);
        System.out.println("Employ3  salary address is : " + e3.salary);

    }
}