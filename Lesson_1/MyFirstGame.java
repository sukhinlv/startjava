public class MyFirstGame {
    public static void main(String[] args) {
        // "случайное" число (0, 100]
        int randomNumber = 76;
        // число, с которого стартует игрок
        int playerNumber = 33;
        // границы загаданного числа
        int minBorder = 1;
        int maxBorder = 100;
        while (true) {
            if (playerNumber == randomNumber) {
                System.out.println("Вы победили!");
                break;
            } else if (playerNumber > randomNumber) {
                System.out.format("Число %d больше того, что загадал компьютер%n", playerNumber);
                maxBorder = playerNumber - 1;
            } else if (playerNumber < randomNumber) {
                System.out.format("Число %d меньше того, что загадал компьютер%n", playerNumber);
                minBorder = playerNumber + 1;
            }
            // типа игрок выбирает новое число
            playerNumber = minBorder + (maxBorder - minBorder) / (playerNumber % 3 + 1); 
        }
    }
}