public class VariablesTheme {
    public static void main(String[] args) {
        // Создание переменных и вывод их значений на консоль
        byte pByte = 10;
        short pShort = 120;
        int pInt = 1981;
        long pLong = 19812022;
        float pFloat = 3.14f;
        double pDouble = 2022.6;
        char pChar = 'A';
        boolean pBool = true;
        System.out.println(pByte);
        System.out.println(pShort);
        System.out.println(pInt);
        System.out.println(pLong);
        System.out.println(pFloat);
        System.out.println(pDouble);
        System.out.println(pChar);
        System.out.println(pBool);

        // Расчет стоимости товара со скидкой
        double goodsX = 100;
        double goodsY = 200;
        int discount = 11;
        System.out.println("\nСумма скидки: " + (goodsX + goodsY) * discount / 100);
        System.out.println("Общая стоимость товаров: " + (goodsX + goodsY));

        //Вывод на консоль слова JAVA
        System.out.println("\n   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");

        // Отображение min и max значений числовых типов данных
        byte pByteNumber = Byte.MAX_VALUE;
        short pShortNumber = Short.MAX_VALUE;
        int pIntNumber = Integer.MAX_VALUE;
        long pLongNumber = Long.MAX_VALUE;
        
        System.out.println("\nПервоначальное значение для переменной типа Byte: " + pByteNumber);
        pByteNumber++;
        System.out.println("Инкрементирование значение для переменной типа Byte: " + pByteNumber);
        pByteNumber--;
        System.out.println("Декрементированное значение для переменной типа Byte: " + pByteNumber);

        System.out.println("\nПервоначальное значение для переменной типа Short: " + pShortNumber);
        pShortNumber++;
        System.out.println("Инкрементирование значение для переменной типа Short: " + pShortNumber);
        pShortNumber--;
        System.out.println("Декрементированное значение для переменной типа Short: " + pShortNumber);

        System.out.println("\nПервоначальное значение для переменной типа Int: " + pIntNumber);
        pIntNumber++;
        System.out.println("Инкрементирование значение для переменной типа Int: " + pIntNumber);
        pIntNumber--;
        System.out.println("Декрементированное значение для переменной типа Int: " + pIntNumber);

        System.out.println("\nПервоначальное значение для переменной типа Long: " + pLongNumber);
        pLongNumber++;
        System.out.println("Инкрементирование значение для переменной типа Long: " + pLongNumber);
        pLongNumber--;
        System.out.println("Декрементированное значение для переменной типа Long: " + pLongNumber);

        // Перестановка значений переменных
        double d1 = 1.1;
        double d2 = 2.2;
        double dtemp;

        System.out.println("\nОбмен значений с помощью третьей переменной");
        System.out.println("До обмена d1 = " + d1 + ", d2 = " + d2);
        dtemp = d2;
        d2 = d1;
        d1 = dtemp;
        System.out.println("После обмена d1 = " + d1 + ", d2 = " + d2);

        System.out.println("\nОбмен значений с помощью арифметической операции");
        System.out.println("До обмена d1 = " + d1 + ", d2 = " + d2);
        d1 = d1 + d2;
        d2 = d1 - d2;
        d1 = d1 - d2;
        System.out.println("После обмена d1 = " + d1 + ", d2 = " + d2);

        System.out.println("\nОбмен значений с помощью побитовой операции ^");
        System.out.println("До обмена d1 = " + d1 + ", d2 = " + d2);
        int i1 = (int) (d1 * 10);
        int i2 = (int) (d2 * 10);
        i1 = i1 ^ i2;
        i2 = i2 ^ i1;
        i1 = i1 ^ i2;
        d1 = (double) i1 / 10;
        d2 = (double) i2 / 10;
        System.out.println("После обмена d1 = " + d1 + ", d2 = " + d2);

        // Вывод символов и их кодов
        int code1 = 35;
        int code2 = 38;
        int code3 = 64;
        int code4 = 94;
        int code5 = 95;
        System.out.println("\nКод символа: " + code1 + ", символ: " + (char) code1);
        System.out.println("Код символа: " + code2 + ", символ: " + (char) code2);
        System.out.println("Код символа: " + code3 + ", символ: " + (char) code3);
        System.out.println("Код символа: " + code4 + ", символ: " + (char) code4);
        System.out.println("Код символа: " + code5 + ", символ: " + (char) code5);

        // Произведение и сумма цифр числа
        int someDigit = 345;
        int number1 = someDigit / 100;
        int number2 = someDigit % 100 / 10;
        int number3 = someDigit % 10;
        int numberssum = number1 + number2 + number3;
        int numbersmult = number1 * number2 * number3;
        System.out.println("\nСумма цифр числа " + someDigit + " = " + numberssum);
        System.out.println("Произведение цифр числа " + someDigit + " = " + numbersmult);

        // Вывод на консоль ASCII-арт Дюка
        // ... ужасно неохота это делать

        // Отображение количества сотен, десятков и единиц числа
        someDigit = 123;
        number1 = someDigit / 100;
        number2 = someDigit % 100;
        number3 = someDigit % 10;
        System.out.println("\nЧисло  " + someDigit + " содержит " + number1 + " сотен");
        System.out.println("Число  " + someDigit + " содержит " + number2 + " десятков");
        System.out.println("Число  " + someDigit + " содержит " + number3 + " единиц");

        // Преобразование секунд
        int secondsTotal = 86399;
        int hours = secondsTotal / 3600;
        int minutes = secondsTotal % 3600 / 60;
        int seconds = secondsTotal % 60;
        System.out.println("Результат преобразования " + secondsTotal + " в формат ЧЧ:ММ:СС - " +
            (hours / 10) + (hours % 10) + ":" +
            (minutes / 10) + (minutes % 10) + ":" + 
            (seconds / 10) + (seconds % 10));
    }
}