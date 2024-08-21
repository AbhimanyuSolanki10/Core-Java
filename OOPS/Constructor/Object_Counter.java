
class Object_Counter {
    static int object_counter=0;
    Object_Counter() {
        object_counter++;
        System.out.println("Fruit Object " + object_counter + "is created");
        System.out.println("Total object created is " + Object_Counter.object_counter);
    }
    public static void main(String[] args) {
        Object_Counter o1 = new Object_Counter();
    }
}