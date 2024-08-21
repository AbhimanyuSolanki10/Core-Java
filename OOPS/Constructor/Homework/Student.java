class Student{
    String name;
    int roll;
    double fees;
  

    Student(String name , int roll , double fees){
        this.name=name;
        this.roll =roll;
        this.fees=fees;
    }

    public void getDetails(){
        System.out.println("The name of Student is " + name);
        System.out.println("The roll of Student is " + roll);
        System.out.println("The fees of Student is " + fees);
    } 
}