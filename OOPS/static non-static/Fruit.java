class  Fruit
{
    static int x=30;
    public static  void test(int x)
    {
        System.out.println("Static test Method");
        System.out.println("Local x is :"+ x);
        System.out.println("Static x is :"+ Fruit.x);
        
    }
    public static void  main(String[] args)
    {
        System.out.println("Main Method!!");
        int p=11;
        test(p);
    }
    // public static  void test()
    // {
    //     System.out.println("This is test Method");
    //     int x = 60;
    //     System.out.println("Local x is :"+ x);
    //     System.out.println("Static x is :"+ Fruit.x);
        
    // }
    // public static void  main(String[] args)
    // {
    //     test();
    // }
}