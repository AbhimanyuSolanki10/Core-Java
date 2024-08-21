class Vehicle{
    String name;
    double price;
    int wheels;

    Vehicle(String name , double price , int wheels){
        this.name=name;
        this.price=price;
        this.wheels=wheels;
    }
    public void getDetails(){
        System.out.println("The name of Vehicle is " + name);
        System.out.println("The price of Vehicle is " + price);
        System.out.println("The wheels of Vehicle is " + wheels);
    }
}