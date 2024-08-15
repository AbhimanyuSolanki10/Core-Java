class EmployDriver {
    public static void main(String[] args) {
        Employ e1 = new Employ();
        Employ e2 = new Employ();
        Employ e3 = new Employ();
        e1.name="Mohan";
        e1.id=123;
        e2.name="Sohan";
        e2.salary=51234.5;
        e2.id=233;
        e3.name="ManMohan";
        e3.salary=58934.5;
        e3.id=563;

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