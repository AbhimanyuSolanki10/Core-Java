// File name: Practice.java

public class Practice {
    // Non-static method with a different name
    public void nonStaticMain(String[] args) {
        System.out.println("Non-static main method called.");
    }

    // Static main method - the program entry point
    public static void main(String[] args) {
        // Creating an object of the class to call the non-static main method
        Practice obj = new Practice();
        obj.nonStaticMain(args);  // This will call the non-static main method
    }
}
