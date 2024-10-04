

class StringArray1 {
    public static void main(String[] args) {
        String[] a ={"Mohan","Sohan","jack ans mack" ,"Rohan"};

     printString(a) ;

    }
    public static void printString(String [] a){
        for(String p:a){
            System.out.println(p + " size is :"+ p.length());
        }

    }
}