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
        if (sign == '+' ||
                sign == '-' ||
                sign == '*' ||
                sign == '/' ||
                sign == '%' ||
                sign == '^') {
            this.sign = sign;
        } else {
            System.out.printf("Неизвестный знак \"%s\"! Операция не выполнена.\n", sign);
        }
    }

    public int calculate() {
        return switch (sign) {
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
                System.out.printf("Неизвестный знак \"%s\"! Операция не выполнена.\n", sign);
                yield 0;
            }
        };
    }
    
}