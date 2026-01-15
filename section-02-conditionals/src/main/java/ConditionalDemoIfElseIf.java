import java.util.Scanner;

public class ConditionalDemoIfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstDivMin = 90.0;
        double secondDivMin = 80.00;

        System.out.print("Enter Your Marks ");
        double userMarks = input.nextDouble();

        if (userMarks >= firstDivMin) {
            System.out.println("Your score in in tier 1");
        } else if (userMarks >= secondDivMin) {
            System.out.println("Your score in in tier 2");
        } else {
            System.out.println("Your score in not in top 2 tiers");
        }

        input.close();
    }
}
