public class MyFirstGame {
    public static void main(String[] args) {
        // "случайное" число (0, 100]
        int randomNumber = 76;
        // число, с которого стартует игрок
        int playerNumber = 33;
        // границы загаданного числа
        int startRange = 1;
        int endRange = 100;
        while (true) {
            if (playerNumber > randomNumber) {
                System.out.format("Число %d больше того, что загадал компьютер%n", playerNumber);
                endRange = playerNumber - 1;
            } else if (playerNumber < randomNumber) {
                System.out.format("Число %d меньше того, что загадал компьютер%n", playerNumber);
                startRange = playerNumber + 1;
            } else {
                break;
            }
            // типа игрок выбирает новое число
            playerNumber = startRange + (endRange - startRange) / (playerNumber % 3 + 1); 
        }
        System.out.println("Вы победили!");
    }
}