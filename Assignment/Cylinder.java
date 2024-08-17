class Cylinder {
    double h;
    double r;
    double pi=3.14159265359;

    public void setValue(double h , double r){
        this.h=h;
        this.r=r;
    }

    public void csa(){
        System.out.println("Cureved Surface Area of Cylinder is : " + 2*pi*r*h);
    }

    public void tsa(){
        System.out.println("Total  Surface Area of Cylinder is : " + 2*pi*r*(h+r));

    }

    public void volume(){
        System.out.println("Volume of Cylinder is : " + pi*Math.pow(r, 2)*h);

    }
}