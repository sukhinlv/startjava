public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Создание переменных и вывод их значений на консоль");
        byte hardDriveCount = 2;
        short osEdition = 10;
        int osVersion = 1607;
        long memoryRAM = 16777216;
        float coreSpeed = 3.3f;
        double calculatorVersion = 10.1705;
        char backupDrive = 'F';
        boolean gitInstalled = true;
        System.out.println("byte hardDriveCount = " + hardDriveCount);
        System.out.println("short osEdition = " + osEdition);
        System.out.println("int osVersion = " + osVersion);
        System.out.println("long memoryRAM = " + memoryRAM);
        System.out.println("float coreSpeed = " + coreSpeed);
        System.out.println("double calculatorVersion = " + calculatorVersion);
        System.out.println("char backupDrive = " + backupDrive);
        System.out.println("boolean gitInstalled = " + gitInstalled);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double priceGoodsX = 100;
        double priceGoodsY = 200;
        int discount = 11;
        System.out.println("Сумма скидки: " + (priceGoodsX + priceGoodsY) * discount / 100);
        System.out.println("Общая стоимость товаров со скидкой: " + (priceGoodsX + priceGoodsY) * 
            (100 - discount) / 100);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte byteNumber = Byte.MAX_VALUE;
        short shortNumber = Short.MAX_VALUE;
        int intNumber = Integer.MAX_VALUE;
        long longNumber = Long.MAX_VALUE;
        
        System.out.println("\nПервоначальное значение для переменной типа Byte: " + byteNumber);
        System.out.println("Инкрементирование значение для переменной типа Byte: " + byteNumber++);
        System.out.println("Декрементированное значение для переменной типа Byte: " + byteNumber--);

        System.out.println("\nПервоначальное значение для переменной типа Short: " + shortNumber);
        System.out.println("Инкрементирование значение для переменной типа Short: " + shortNumber++);
        System.out.println("Декрементированное значение для переменной типа Short: " + shortNumber--);

        System.out.println("\nПервоначальное значение для переменной типа Int: " + intNumber);
        System.out.println("Инкрементирование значение для переменной типа Int: " + intNumber++);
        System.out.println("Декрементированное значение для переменной типа Int: " + intNumber--);

        System.out.println("\nПервоначальное значение для переменной типа Long: " + longNumber);
        System.out.println("Инкрементирование значение для переменной типа Long: " + longNumber++);
        System.out.println("Декрементированное значение для переменной типа Long: " + longNumber--);

        System.out.println("\n5. Перестановка значений переменных");
        double number1 = 1.1;
        double number2 = 2.2;
        double tmp;

        System.out.println("Обмен значений с помощью третьей переменной");
        System.out.println("\nДо обмена number1 = " + number1 + ", number2 = " + number2);
        tmp = number2;
        number2 = number1;
        number1 = tmp;
        System.out.println("После обмена number1 = " + number1 + ", number2 = " + number2);

        System.out.println("\nОбмен значений с помощью арифметической операции");
        System.out.println("До обмена number1 = " + number1 + ", number2 = " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("После обмена number1 = " + number1 + ", number2 = " + number2);

        System.out.println("\nОбмен значений с помощью побитовой операции ^");
        System.out.println("До обмена number1 = " + number1 + ", number2 = " + number2);
        int tmp1 = (int) (number1 * 10);
        int tmp2 = (int) (number2 * 10);
        tmp1 = tmp1 ^ tmp2;
        tmp2 = tmp2 ^ tmp1;
        tmp1 = tmp1 ^ tmp2;
        number1 = (double) tmp1 / 10;
        number2 = (double) tmp2 / 10;
        System.out.println("После обмена number1 = " + number1 + ", number2 = " + number2);

        System.out.println("\n6. Вывод символов и их кодов");
        int code1 = 35;
        int code2 = 38;
        int code3 = 64;
        int code4 = 94;
        int code5 = 95;
        System.out.println("Код символа: " + code1 + ", символ: " + (char) code1);
        System.out.println("Код символа: " + code2 + ", символ: " + (char) code2);
        System.out.println("Код символа: " + code3 + ", символ: " + (char) code3);
        System.out.println("Код символа: " + code4 + ", символ: " + (char) code4);
        System.out.println("Код символа: " + code5 + ", символ: " + (char) code5);

        System.out.println("\n7. Произведение и сумма цифр числа");
        int srcNumber = 345;
        int digit1 = srcNumber / 100;
        int digit2 = srcNumber % 100 / 10;
        int digit3 = srcNumber % 10;
        int sumDigits = digit1 + digit2 + digit3;
        int prodDigits = digit1 * digit2 * digit3;
        System.out.println("Сумма цифр числа " + srcNumber + " = " + sumDigits);
        System.out.println("Произведение цифр числа " + srcNumber + " = " + prodDigits);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        /*
        // через String
        String slash = "/";
        String backslash = "\\";
        String underline = "_";
        String bracketOpen = "(";
        String bracketClose = ")";
        String space = " ";
        System.out.println(space + space + space + space + slash + backslash);
        System.out.println(space + space + space + slash + space + space + backslash);
        System.out.println(space + space + slash + underline + bracketOpen + space + bracketClose +
                            backslash);
        System.out.println(space + slash + space + space + space + space + space + space + backslash);
        System.out.println(slash + underline + underline + underline + underline + slash +
                            backslash + underline + underline + backslash);
        */

        // через Char
        char slash = '/';
        char backslash = '\\';
        char underline = '_';
        char bracketOpen = '(';
        char bracketClose = ')';
        char space = ' ';
        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + underline + bracketOpen + space + bracketClose +
                            backslash);
        System.out.println("" + space + slash + space + space + space + space + space + space + backslash);
        System.out.println("" + slash + underline + underline + underline + underline + slash +
                            backslash + underline + underline + backslash);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
        srcNumber = 123;
        int hundreds = srcNumber / 100;
        int tens = srcNumber % 100 / 10;
        int ones = srcNumber % 10;
        System.out.println("Число  " + srcNumber + " содержит ");
        System.out.println("сотен: " + hundreds);
        System.out.println("десятков:" + tens);
        System.out.println("единиц: " + ones);

        System.out.println("\n10. Преобразование секунд");
        int totalSec = 86399;
        int hours = totalSec / 3600;
        int minutes = totalSec % 3600 / 60;
        int seconds = totalSec % 60;
        System.out.println("Результат преобразования " + totalSec + " в формат ЧЧ:ММ:СС - " +
            (hours / 10) + (hours % 10) + ":" +
            (minutes / 10) + (minutes % 10) + ":" + 
            (seconds / 10) + (seconds % 10));
    }
}