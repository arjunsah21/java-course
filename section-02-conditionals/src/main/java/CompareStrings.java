public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        boolean result1 = (s1 == s2);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("result1: " + result1);
        System.out.println();

        String s3 = new String("Hello");
        boolean result2 = (s3 == s1);
        System.out.println("s1: " + s1);
        System.out.println("s3: " + s3);
        System.out.println("result2: " + result2);
        System.out.println();

        // '==' operator compares the memory address of the strings not the actual content
        // so to compare the strings use .equals method

        boolean result3 = s1.equals(s3);
        System.out.println("s1: " + s1);
        System.out.println("s3: " + s3);
        System.out.println("result3: " + result3);
        System.out.println();

        // we can also ignore the case of string while comparing
        String s4 = new String("hello");
        boolean result4 = s1.equalsIgnoreCase(s4);
        System.out.println("s1: " + s1);
        System.out.println("s3: " + s3);
        System.out.println("result4: " + result4);
        System.out.println();


    }
}
