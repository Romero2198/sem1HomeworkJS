import java.util.Scanner;
public class sem1Homework {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Задайте число: ");
        int number = iScanner.nextInt();
        System.out.println("Треугольное число " + number + " = " + triangularFormula(number));
    }
    public static int triangularFormula(int number) {
        int t = (number * (number + 1)) / 2;
        return t;
    }
}
