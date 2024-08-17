
    
class Triangle {
    double a;
    double b;
    double c;

    public void setValue(double a , double b ,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void getArea(){
        if(a+b>c && b+c>a && a+c>b){
        System.out.println(" Valid Triangle " );
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(" Area of Triangle is " + area + "sq unit");
        }else{
        System.out.println(" InValid Triangle " );
        }
    }

    public void perimeter(){
         if(a+b>c && b+c>a && a+c>b){
        System.out.println(" Valid Triangle " );
        System.out.println(" Perimeter of Triangle is " + (a+b+c) + " unit");
         }else{
        System.out.println(" InValid Triangle " );
         }
    }

   
}