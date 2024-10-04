
class StringArray3 {

    public static void main(String[] args) {
        String[] a = {"Mohan", "Sohan", "jack ans mack", "Rohan"};
        String biggest=getBiggestString(a);
        System.out.println("Biggest String is :" + biggest);

    }

    public static String getBiggestString(String[] a) {
        String biggest ="";
        for(String p : a) {
            if (p.length()>biggest.length()) {
                biggest=p;
               
            }
        }
        return biggest;
    }
}
