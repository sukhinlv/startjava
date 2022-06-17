import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int guessedNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(int startRange, int endRange) {
        Random rnd = new Random();
        guessedNumber = startRange + rnd.nextInt(endRange - startRange + 1);

        System.out.format("%nЗагадано число от %d до %d%n", startRange, endRange);
        do {
            if (numberGuessed(player1)) {
                break;
            }
            if (numberGuessed(player2)) {
                break;
            }
        } while (true);
    }

    private boolean numberGuessed(Player player) {
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        System.out.format("%nХодит %s. Введите число: ", player.getName());
        player.setNumber(sc.nextInt());
        sc.nextLine();
        if (player.getNumber() > guessedNumber) {
            System.out.format("Число %d больше того, что загадал компьютер%n", player.getNumber());
        } else if (player.getNumber() < guessedNumber) {
            System.out.format("Число %d меньше того, что загадал компьютер%n", player.getNumber());
        } else {
            System.out.println("\nВерно! Победил игрок " + player.getName());
            result = true;
        }
        return result;
    }
}