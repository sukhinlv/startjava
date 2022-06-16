import java.util.Scanner;

public class CalculatorTest {

    public static boolean answerIsYes(String question) {
        String choice = "";
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.format("%s [yes/no]: ", question);
            choice = sc.nextLine().toLowerCase();
            result = choice.equals("yes");
        } while (!choice.equals("yes") && !choice.equals("no"));
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean anotherCalculation = true;
        Calculator calc = new Calculator();
        /*
            использование sc.nextLine(); после sc.nextInt() нужно, 
            чтобы не происходило пустого ввода в следующий запрос ввода
            https://ru.stackoverflow.com/questions/526818/scanner-не-считывает-строку-после-nextint
        */
        do {
            System.out.print("\nВведите первое число: ");
            calc.setA(sc.nextInt());
            sc.nextLine();
            System.out.print("Введите знак математической операции: ");
            calc.setSign(sc.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setB(sc.nextInt());
            sc.nextLine();

            System.out.println(calc.getA() + " " + calc.getSign() + " " + calc.getB() + " = " + calc.calc());
        } while (answerIsYes("Хотите продолжить вычисления?"));
    }
}