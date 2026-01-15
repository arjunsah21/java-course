import java.util.Scanner;

public class SwitchComputerType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your computer type ... ");
        String computerType = input.nextLine();

        computerType = computerType.toLowerCase();

        switch (computerType) {
            case "smartphone":
                System.out.println("Smartphones offer computing power in your hand");
                break;
            case "tablet":
                System.out.println("Tablets are lightweight, useful for browsing and watching shows");
                break;
            case "laptop":
                System.out.println("Laptops are portable computers, useful for daily work");
                break;
            case "desktop":
                System.out.println("Desktops are used for heavy work");
                break;
            default:
                System.out.println("Unknown computer type");
        }

        input.close();
    }
}
