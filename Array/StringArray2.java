
class StringArray2 {

    public static void main(String[] args) {
        String[] a = {"Mohan", "Sohan", "jack and mack", "Rohan"};

        printString(a);

    }

    public static void printString(String[] a) {
        int count = 0;
        for(String p : a) {
            if (p.length()%2 == 0) {
                System.out.println(p + "\t ===> size is :" + p.length());
                count++;
            }
        }
        System.out.println("Total Such Element are:" + count);
    }
}
