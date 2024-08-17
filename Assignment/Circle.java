class Circle {
   double r;

   public void setValue(double r){
        this.r=r;
   }
   public void area(){
    System.out.println("the area of circle is :" + ( 3.14159265359 * (Math.pow(r, 2)) ));
   }
   public void perimeter(){
    System.out.println("the perimeter of circle is :" + (2*3.14159265359*r));
   }
   
}