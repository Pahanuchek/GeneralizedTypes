public class Calculator {

    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> double divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        Integer num1 = 10;
        Double num2 = 5.5;

        System.out.println("Сложение: " + sum(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
    }
}
