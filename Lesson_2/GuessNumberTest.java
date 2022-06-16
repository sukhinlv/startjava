import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите имя первого игрока: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(sc.nextLine());
        GuessNumber guessGame = new GuessNumber(player1, player2);
        do {
            guessGame.startGame(1, 100);
        } while (answerIsYes("Хотите продолжить игру?"));
    }

    private static boolean answerIsYes(String question) {
        String choice;
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.format("%n%s [yes/no]: ", question);
            choice = sc.nextLine().toLowerCase();
            result = choice.equals("yes");
        } while (!choice.equals("yes") && !choice.equals("no"));
        return result;
    }
}