public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 35;
        boolean male = true;
        double height = 1.73;
        String name = "Леонид";

        if (age > 20) {
            System.out.println("Вижу, ты стал постарше");
        } else {
            System.out.println("Привет, молодежь!");
        }

        if (!male) {
            System.out.println("Как ваши дела, мадам?");
        } else {
            System.out.println("Как дела, парень?");
        }

        if (height < 1.8) {
            System.out.println("Высокий рост это не про тебя");
        } else {
            System.out.println("Ого, вот это рост!");
        }

        char firtstLetterOfName = name.charAt(0);
        if (firtstLetterOfName == 'М') {
            System.out.println("Думаю, твое имя начинается на букву М");
        } else if (firtstLetterOfName == 'I') {
            System.out.println("Какое интересное имя на букву I, что бы это могло быть?");
        } else {
            System.out.println("Гадаю, как тебя зовут, но что-то никак");
        }

        System.out.println("\n2. Поиск max и min числа");
        int number1 = 33221;
        int number2 = 9883;
        if (number1 > number2) {
            System.out.println("Число №1 (" + number1 + ") больше числа №2 (" + number2 + ")");
        } else {
            System.out.println("Число №2 (" + number2 + ") больше числа №1 (" + number1 + ")");
        }

        System.out.println("\n3. Работа с числом");
        int srcNumber = -53323;
        if (srcNumber != 0) {
            if (srcNumber % 2 == 0) {
                System.out.println("\tчетное");
            } else {
                System.out.println("\tнечетное");
            }

            if (srcNumber > 0) {
                System.out.println("\tположительное");
            } else {
                System.out.println("\tотрицательное");
            }
        } else {
            System.out.println("исходное число = 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        number1 = 463;
        number2 = 263;
        boolean matchDigit1 = (number1 / 100) == (number2 / 100);
        boolean matchDigit2 = (number1 % 100 / 10) == (number2 % 100 / 10);
        boolean matchDigit3 = (number1 % 10) == (number2 % 10);
        // проверяем есть ли хоть одна одинаковая цифра
        if (!matchDigit1 && !matchDigit2 && !matchDigit3) {
            System.out.print("В числах " + number1 + " и " + number2 + 
                " нет одинаковых цифр в соответствующих разрядах");
        } else {
            System.out.print("В числах " + number1 + " и " + number2 + " одинаковые цифры ");
            if (matchDigit1) {
                System.out.print("\n\t " + (number1 / 100) + " стоят в сотнях");
            }
            if (matchDigit2) {
                System.out.print("\n\t " + (number1 % 100 / 10) + " стоят в десятках");
            }
            if (matchDigit3) {
                System.out.print("\n\t " + (number1 % 10) + " стоят в единицах");
            }
        }

        System.out.println("\n\n5. Определение буквы, числа или символа по их коду");
        char someChar = '\u0057'; // W
        System.out.println("числовое значение символа: " + (short) someChar);
        System.out.println("символ в таблице ASCII: " + someChar);
        
        if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("большая буква");
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("маленькая буква");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println("это число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent = 0;
        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else {
            percent = 10;
        }
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный процент (" + percent + "): " + deposit * percent / 100);
        System.out.println("Итоговая сумма с процентами: " + (deposit + deposit * percent / 100));

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProg = 91;
        int gradeHistory = 2;
        int gradeProg = 2;

        if (percentHistory > 60 && percentHistory <= 73) gradeHistory = 3;
        if (percentHistory >= 73 && percentHistory <= 91) gradeHistory = 4;
        if (percentHistory > 91) gradeHistory = 5;

        if (percentProg > 60 && percentProg <= 73) gradeProg = 3;
        if (percentProg >= 73 && percentProg <= 91) gradeProg = 4;
        if (percentProg > 91) gradeProg = 5;

        System.out.println("" + gradeHistory + " - история");
        System.out.println("" + gradeProg + " - программирование");
        System.out.println("Средний балл: " + (gradeHistory + gradeProg) / 2);
        System.out.println("Средний % по предметам: " + (percentHistory + percentProg) / 2);

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int profit = 13000;
        int cost = 9000;
        int yearProfit = (profit - rent - cost) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: +" + yearProfit);
        } else {
            System.out.println("Прибыль за год: " + yearProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        // требуемая сумма
        int cash = 567;
        // количество банкнот банкомате  номиналом 1, 10, 100
        int availBanknote1 = 100_000; 
        int availBanknote10 = 5;
        int availBanknote100 = 50_000;
        // переменные для расчета требуемого количества банкнот к выдаче
        int issueBanknote1;
        int issueBanknote10;
        int issueBanknote100;
        boolean insufficientBanknotes = false;

        /*
            ○   проведите обратный расчет начальной суммы по полученному количеству банкнот, чтобы убедиться в правильности вычислений
            ○   если каких-то банкнот не хватает, то их нужно заменить банкнотами другого номинала
            ○   выведите в консоль:
            i.  номиналы банкнот
            ii. требуемое их количество
            iii.    посчитанную исходную сумму
        */
        issueBanknote100 = cash / 100;
        issueBanknote10 = cash % 100 / 10;
        issueBanknote1 = cash % 10;

        if (issueBanknote100 > availBanknote100) {
            issueBanknote10 += (issueBanknote100 - availBanknote100) * 10;
            issueBanknote100 = availBanknote100;
        }
        if (issueBanknote10 > availBanknote10) {
            issueBanknote1 += (issueBanknote10 - availBanknote10) * 10;
            issueBanknote10 = availBanknote10;
        }
        if (issueBanknote1 > availBanknote1) {
            insufficientBanknotes = true;
        }

        System.out.println("Запрощенная сумма: " + cash);
        if (!insufficientBanknotes) {
            int controlCash = issueBanknote100 * 100 + issueBanknote10 * 10 + issueBanknote1;
            if (controlCash == cash) {
                System.out.println("Правильность вычислений проверена");
            } else {
                System.out.println("ВЫЧИСЛЕНИЯ СОДЕРЖАТ ОШИБКУ!");
            }
            System.out.println("банкнот с номиналом 100: " + issueBanknote100);
            System.out.println("банкнот с номиналом 10: " + issueBanknote10);
            System.out.println("банкнот с номиналом 1: " + issueBanknote1);
            System.out.println("исходная сумма:  " + controlCash);
        } else {
            System.out.println("В банкомате нет такой суммы!");
        }
    }    
} 