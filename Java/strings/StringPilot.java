public class StringPilot {
    public static void main(String[] args) {
        String name = "Hari"; // Type begins with a uppercase is a class in Java
        System.out.println(name);

        // Sting deepdive
        String id = "kumar";
        String id2 = "kumar";
        System.out.println(id == id2); // true because both points to the same memory in the string pool

        String name11 = new String("hari");
        String name12 = new String("hari");
        System.out.println(name11 == name12); // false because both are different objects

        // To only check the value use the .equals method

        System.out.println(name11.equals(name12)); // this compares only the value of the string
    }

}