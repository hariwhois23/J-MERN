public class FormattedString {
    public static void main(String[] args) {
        float pi = 3.1432f;
        // printing only the 2 decimal places of the pi
        System.out.printf("The pi with two decimal places %.2f", pi);// It also rounds off

        System.out.println();

        System.out.println(Math.PI);
        System.out.printf("%.4f", Math.PI);
        System.out.println();

        // Using format string %s -> String parameter
        System.out.printf("Hello I'm %s, I want to become a %s", "hari", "devops engineer");
        // The syntax is (format %(placeholder), value_of_the_placholder)
    }

}
