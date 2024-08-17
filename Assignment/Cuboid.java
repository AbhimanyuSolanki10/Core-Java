class Cuboid {
   double l;
   double b;
   double h;

   public void setValue(double l , double b , double h){
    this.l=l;
    this.b=b;
    this.h=h;
   }

   public void tsa(){
        System.out.println("the total surface are of cuboid is : " + 2*((l*b) + (b*h) + (l*h)));
   }
   public void lsa(){
        System.out.println("the lateral surface are of cuboid is : " + 2*h*(l+b));

   }
   public void vloume(){
        System.out.println("the volume of cuboid is : " + (l*b*h));

   }
   public void perimeter(){
        System.out.println("the perimeter of cuboid is : " + 4*(l+b+h) );

   }
}