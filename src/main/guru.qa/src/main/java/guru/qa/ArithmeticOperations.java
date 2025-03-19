package guru.qa;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = 10;
        int b = 20;
        int c = 25;
        System.out.println("применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (a--)+"\n");

        // применить несколько арифметических операций над int и double в одном выражении
        double d = 20.0;
        System.out.println("применить несколько арифметических операций над int и double в одном выражении");
        System.out.println("d + f = " + (a + d));
        System.out.println("d - f = " + (a - d));
        System.out.println("d * f = " + (a * d));
        System.out.println("f / d = " + (d / a));
        System.out.println("f % d = " + (d % a) +"\n");

        // применить несколько логических операций ( < , >, >=, <= )
        System.out.println("применить несколько логических операций ( < , >, >=, <= )");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b)+"\n");

        // прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение
        // получить переполнение при арифметической операции
        System.out.println("получить переполнение при арифметической операции");
        System.out.println("Переполненное значение float: " + (Float.MAX_VALUE*10)); // Infinity
        System.out.println("Переполненное значение double: " + (Double.MAX_VALUE*10)); // Infinity

    }
}