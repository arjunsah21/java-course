import java.util.Scanner;

public class EnumDemo {
    static void main(String[] args) {

        ComputerType myComputerType = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your computer type ... ");
        String computerType = input.next().trim().toUpperCase();

        // convert string to ENUM
        try {
            myComputerType = ComputerType.valueOf(computerType);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid computer type");
            System.exit(1);
        } finally {
            input.close();
        }

        // returns the computer type info
        String info = switch (myComputerType) {
            case ComputerType.SMARTPHONE -> "Smartphones are computing power in hands";
            case ComputerType.TABLET -> "Tablets are lightweight, useful for daily work";
            case ComputerType.LAPTOP -> "Laptops are portable computers, useful for daily work";
            case ComputerType.DESKTOP -> "Desktops are portable computers, useful for daily work";
            default -> "Invalid computer type.";
        };

        System.out.println(info);
    }
}
