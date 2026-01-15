import java.util.Scanner;

public class ModernSwitchComputerType {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your computer type ... ");
        String computerType = input.next();
        computerType = computerType.toLowerCase();

        // version1 print the computer type info
        /*
        switch (computerType) {
            case "smartphone" -> System.out.println("Smartphones are computing power in hands");
            case "tablet" -> System.out.println("Tablets are lightweight, useful for daily work");
            case "laptop" -> System.out.println("Laptops are portable computers, useful for daily work");
            case "desktop" -> System.out.println("Desktops are portable computers, useful for daily work");
            default -> System.out.println("Invalid computer type.");
        }
        */

        // version2 returns the computer type info
         String info = switch (computerType) {
            case "smartphone" -> "Smartphones are computing power in hands";
            case "tablet" -> "Tablets are lightweight, useful for daily work";
            case "laptop" -> "Laptops are portable computers, useful for daily work";
            case "desktop" -> "Desktops are portable computers, useful for daily work";
            default -> "Invalid computer type.";
        };

        System.out.println(info);
        input.close();
    }
}
