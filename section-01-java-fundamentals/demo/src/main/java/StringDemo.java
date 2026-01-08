public class StringDemo {
    public static void main(String[] args) {
//        var message = "Hello World!";
//        var extra = "I Love to code :-)";

        String message = "Hello World!";
        String extra = "I Love to code :-)";

        System.out.println(message + " " + extra);
        System.out.println("Length of the " + message + " is " + message.length());
        System.out.println("Lowercase version of " + message + " is " + message.toLowerCase());
        System.out.println("Uppercase version of " + message + " is " + message.toUpperCase());

        String combo = message + " " + extra;
        System.out.println("Combo : " + combo);
    }
}
