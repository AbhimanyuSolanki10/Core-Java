class Vechicle 
{
    int a=48;
    public void start(int a) 
    {
        System.out.println("non-static start method ");
        System.out.println("Local a is " + a);
        System.out.println("non-static a is " + this.a);
    }
    public static void main(String[] args) {
        System.out.println("Main Starts!! ");
        Vechicle v1= new Vechicle();
        v1.start(444);
    }
    // int a=40;
    // public void start() 
    // {
    //     System.out.println("start method called");
    //     int a =72;
    //     System.out.println("Local a is " + a);
    //     System.out.println("non-static a is " + this.a);
    // }
    // public static void main(String[] args) {
    //     Vechicle v1= new Vechicle();
    //     v1.start();
    // }

}