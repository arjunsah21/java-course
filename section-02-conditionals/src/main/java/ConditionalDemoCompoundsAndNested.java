import java.util.Scanner;

public class ConditionalDemoCompoundsAndNested {
    public static void main(String[] args) {

        int minClassCont = 5;
        int maxClassCont = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your class range ");

        int userCount = input.nextInt();

        if (userCount >= minClassCont && userCount <= maxClassCont) {
            System.out.println("user class count is within recommended range");
            if ((userCount % 2) == 0) {
                System.out.println("user class is even");
            } else {
                System.out.println("user class is odd");
            }
        } else {
            System.out.println("user class count is not within recommended range");
        }

        input.close();
    }
}
