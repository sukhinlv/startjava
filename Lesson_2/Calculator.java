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
        if (checkSignCorrect(sign)) {
            this.sign = sign;
        } else {
            System.out.println("Неизвестный знак! Операция не выполнена.");
        }
    }

    public int calculate() {
        return calculate(a, b, sign);
    }

    public static boolean checkSignCorrect(char sign) {
        return sign == '+' ||
                sign == '-' ||
                sign == '*' ||
                sign == '/' ||
                sign == '%' ||
                sign == '^';
    }

    public static int calculate(int a, int b, char sign) {
        return
            switch (sign) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> {
                    if (b == 0) {
                        System.out.println("Деление на 0! Операция не выполнена.");
                        yield 0;
                    } else {
                        yield a / b;
                    }
                }
                case '^' -> {
                    if (b >= 0) {
                        int tmpnum = 1;
                        for (int i = 1; i <= b; i++) {
                            tmpnum *=  a;
                        }
                        yield tmpnum;
                    } else {
                        System.out.format("Нельзя возвести в степень %d! Операция не выполнена.%n", b);
                        yield 0;
                    }
                }
                case '%' -> {
                    if (b == 0) {
                        System.out.println("Деление на 0! Операция не выполнена.");
                        yield 0;
                    } else {
                        yield a % b;
                    }
                }
                default -> {
                    System.out.println("Неизвестный знак! Операция не выполнена.");
                    yield 0;
                }
            };
    }
    
}