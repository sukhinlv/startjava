public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int evenSum = 0;
        int oddSum = 0;
        for (int i = -10; i <= 21; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.format("в промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d%n",
                evenSum, oddSum);

        System.out.println("\n2. Вывод чисел в интервале между (max и min)");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int minNumber;
        int maxNumber;
        if (number1 > number2) {
            maxNumber = number1;
            minNumber = number2;
        } else {
            maxNumber = number2;
            minNumber = number1;
        }
        if (number3 > maxNumber) {
            maxNumber = number3;
        } else if (number3 < minNumber) {
            minNumber = number3;
        }
        System.out.format("числа в интервале (%d, %d):%n", minNumber, maxNumber);
        for (int i = minNumber + 1; i <= (maxNumber - 1); i++) {
            System.out.format("%d ", i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int sumDigits = 0;
        int divider = 1;
        int currDigit;
        System.out.print("исходное число в обратном порядке: ");
        while (srcNumber > 0) {
            currDigit = (srcNumber % (divider * 10)) / divider;
            sumDigits += currDigit;
            System.out.format("%d", currDigit);
            srcNumber -= currDigit * divider;
            divider *= 10;
        }
        System.out.format("%nсумма цифр числа: %d%n", sumDigits);

        System.out.println("\n4. Вывод чисел [1, 24) на консоль в несколько строк");
        int digitInLine = 5;
        for (int i = 1; i < 24; i += 2) {
            System.out.format("\t" + "%2d", i);
            digitInLine--;
            if (digitInLine == 0) {
                digitInLine = 5;
                System.out.print("\n");
            }
        }
        for (int i = 5; i >= digitInLine; i--) {
            System.out.print("\t 0");
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        int givenNumber = 3141591;
        int oneCounter = 0;
        srcNumber = givenNumber;
        divider = 1;
        currDigit = 0;
        while (srcNumber > 0) {
            currDigit = (srcNumber % (divider * 10)) / divider;
            srcNumber -= currDigit * divider;
            divider *= 10;
            if (currDigit == 1) oneCounter++;
        }
        if (oneCounter % 2 == 0) {
            System.out.format("число %d содержит %d (четное) количество единиц%n",
                    givenNumber, oneCounter);
        } else {
            System.out.format("число %d содержит %d (нечетное) количество единиц%n",
                    givenNumber, oneCounter);
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        // отображаем фигуру из *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // отображаем фигуру из #
        int lineCounter = 5;
        int counter = 0;
        while (lineCounter > 0) {
            counter = lineCounter;
            while (counter > 0) {
                System.out.print("#");
                counter--;
            }
            System.out.print("\n");
            lineCounter--;
        } 
        System.out.print("\n");

        // отображаем фигуру из $
        int ouputCounter = 1;
        lineCounter = 1;
        counter = 1;
        do {
            ouputCounter = 1;
            do {
                System.out.print("$");
                ouputCounter++;
            } while (ouputCounter <= counter);
            System.out.print("\n");
            lineCounter++;
            if (lineCounter <= 3) {
                counter++;
            } else {
                counter--;
            }
        } while (lineCounter <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        // TODO: разобраться как вывести символ, а не команду для первых 12 символов ASCII
        System.out.println("символы, идущие до цифр и имеющие нечетные коды:");
        System.out.println("\tDec\tChar");
        for (int i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.format("\t" + "%3d", i);
                System.out.println("\t   " + (char) i);
            }
        }
        System.out.println("\nмаленькие английские буквы, имеющие четные коды:");
        System.out.println("\tDec\tChar");
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.format("\t" + "%3d", i);
                System.out.println("\t" + (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        // исходное число
        srcNumber = 1234321;
        // временная переменная для разбора исходного числа на цифры
        int tmpNumber = srcNumber;
        // делитель, нужен для выделения цифр из исходного числа
        divider = 1;
        // множитель, нужен построения числа, обратного исходному
        int multiplier = 10;
        // часть числа, используемая при разборе исходного числа на составляющие
        currDigit = 0;
        // в эту переменную попадет число, записанное в обратном порядке
        int controlNumber = 0;
        // счетчик количества чисел в исходном числе
        int digitsCount = 1;

        // получаем множитель для построения обратного числа и количество цифр в числе
        while (srcNumber / multiplier != 0) {
            digitsCount++;
            multiplier *= 10;
        }
        multiplier /= 10;

        // получаем перевернутое представление числа
        divider = 1;
        for (int i = 1; i <= digitsCount; i++) {
            // переменная currDigit здесь избыточная, но оставлена для улучшения читаемости кода
            currDigit = (tmpNumber % (divider * 10)) / divider;
            tmpNumber -= currDigit * divider;
            controlNumber += currDigit * multiplier;
            divider *= 10;
            multiplier /= 10;
        }

        if (srcNumber == controlNumber) {
            System.out.format("число %d является палиндромом%n", srcNumber);
        } else {
            System.out.format("число %d НЕ является палиндромом%n", srcNumber);
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNumber = 123132;
        int leftSum = 0;
        int rightSum = 0;
        multiplier = 100_000;
        System.out.print("сумма цифр ");
        for (int i = 1; i <= 3; i++) {
            currDigit = (srcNumber % (multiplier * 10)) / multiplier;
            srcNumber -= currDigit * multiplier;
            leftSum += currDigit;
            System.out.print(currDigit);
            multiplier /= 10;
        }
        System.out.format(" = %d%n", leftSum);
        System.out.print("сумма цифр ");
        for (int i = 1; i <= 3; i++) {
            currDigit = (srcNumber % (multiplier * 10)) / multiplier;
            srcNumber -= currDigit * multiplier;
            rightSum += currDigit;
            System.out.print(currDigit);
            multiplier /= 10;
        }
        System.out.format(" = %d%n", rightSum);
        if (leftSum == rightSum) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число НЕ является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("   |  2  3  4  5  6  7  8  9");
        System.out.println("----------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.format("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.format("%3d", i * j);
            }
            System.out.format("%n");
        }
   }
}