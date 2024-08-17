class Employ {
    String name;
    int id;
    double salary ;
    int totalDays;
    int absentDays;

    public void  setValue(String name , int id , double salary ){
        this.name = name;
        this.id = id;
        this.salary= salary;
        
    }

    public void actualSalary(int totalDays , int absentDays){
        this.totalDays = totalDays;
        this.absentDays = absentDays;
        System.out.print("Actual salary of employ is : " + (salary/totalDays) * (totalDays-absentDays) );
    }

    public void getDetails(){
        System.out.println("Name of employ is : " + name);
        System.out.println("Id of employ is : " + id);
        System.out.println("Salary of employ is : " + salary);
    }

    

}