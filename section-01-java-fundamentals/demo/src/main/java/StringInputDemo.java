import java.sql.SQLOutput;
import java.util.Scanner;

public class StringInputDemo {

    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your favorite color? ");
        String color = input.nextLine();

        System.out.print("What is your Hobby ");
        String hobby = input.nextLine();

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.println(name + "'s  favorite color is " + color + " and Hobby is " + hobby);

        input.close();
    }
}
