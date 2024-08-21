class Laptop{
    String name;
    double price;
    String modelno;
    String color;

    Laptop(String name , double price , String modelno , String color){
        this.name = name;
        this.price= price;
        this.modelno=modelno;
        this.color=color;
    }

    public void getDetails(){
        System.out.println("The name of Laptop is " + name);
        System.out.println("The price of Laptop is " + price);
        System.out.println("The modelno of Laptop is " + modelno);
        System.out.println("The color of Laptop is " + color);
    }
}