import java.util.Scanner;

public class NumberDemo {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        double gradeExam1 = 87.5;
//        double gradeExam2 = 99.5;
//        double gradeExam3 = 100;

        System.out.print("enter grade exam1 = ");
        double gradeExam1 = scanner.nextDouble();
        System.out.print("enter grade exam2 = ");
        double gradeExam2 = scanner.nextDouble();
        System.out.print("enter grade exam3 = ");
        double gradeExam3 = scanner.nextDouble();

        double gradeAverage = (gradeExam1 + gradeExam2 + gradeExam3) / 3;

//        System.out.println("grade exam1 = " + gradeExam1);
//        System.out.println("grade exam2 = " + gradeExam2);
//        System.out.println("grade exam3 = " + gradeExam3);
        System.out.println("grade average = " + gradeAverage);

        // format the output
        String formattedAvg = String.format("%.2f", gradeAverage);
        System.out.println("formatted average = " + formattedAvg);

        scanner.close();
    }
}
