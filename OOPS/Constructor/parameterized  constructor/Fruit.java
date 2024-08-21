class Fruit {
   String name;
   int price;
   double weight;
   Fruit(String name ,int price , double weight){
    this.name= name;
    this.price=price;
    this.weight=weight;
   }
   public void getDetails(){
        System.out.println("The name of Fruit is " + name);
        System.out.println("The price of Fruit is " + price);
        System.out.println("The wight of Fruit is " + weight);
   }
}