class Rectangle {
    
        double length ;
        double width;
        public void setValue(double  length , double width){
            this.length=length;
            this.width=width;
        }
        public void  area(){
            System.out.println("The area is :-" + length*width);
        }
        public void   perimeter(){
            System.out.println("The perimeter is :-  " + 2*(length+width));
        System.out.println("=========================================");
        } 

}