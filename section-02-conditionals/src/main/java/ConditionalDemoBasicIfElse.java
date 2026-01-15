import java.util.Scanner;

public class ConditionalDemoBasicIfElse {
    public static void main(String[] args) {
        int minVotingAge = 18;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        boolean hasVotingAge = age >= minVotingAge;
        System.out.println("hasVotingAge is " + hasVotingAge);
        if (hasVotingAge) {
            System.out.println("You are Eligible to Vote");
        } else {
            System.out.println("Min voting age is " + minVotingAge);
            System.out.println("You are not Eligible to Vote");
        }

        scanner.close();
    }
}
