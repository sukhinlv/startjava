public class Calculator {

    private int a;
    private int b;
    private char sign;    

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        if (signCorrect(sign)) {
            this.sign = sign;
        } else {
            System.out.println("Неизвестный знак! Операция не выполнена.");
        }
    }

    public int calc() {
        return calc(a, b, sign);
    }

    public static boolean signCorrect(char sign) {
        return sign == '+' ||
                sign == '-' ||
                sign == '*' ||
                sign == '/' ||
                sign == '%' ||
                sign == '^';
    }

    public static int calc(int a, int b, char sign) {
        int result = 0;

        switch (sign) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Деление на 0! Операция не выполнена.");
                } else {
                    result = a / b;
                }
            }
            case '^' -> {
                if (b >= 0) {
                    result = 1;
                    for (int i = 1; i <= b; i++) {
                        result *=  a;
                    }
                } else {
                    System.out.format("Нельзя возвести в степень %d! Операция не выполнена.%n", b);
                }
            }
            case '%' -> {
                if (b == 0) {
                    System.out.println("Деление на 0! Операция не выполнена.");
                } else {
                    result = a % b;
                }
            }
            default -> {
                System.out.println("Неизвестный знак! Операция не выполнена.");
            }
        }
        return result;
    }
    
}