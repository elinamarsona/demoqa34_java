public class ArithmeticOperations {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        double c = 15.5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a + c = " + (a + c));
        System.out.println("a - c = " + (a - c));
        System.out.println("a * c = " + (a * c));
        System.out.println("a / c = " + (a / c));
        System.out.println("a % c = " + (a % c));

        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        double overflow = maxDouble * 2;

        System.out.println("minFloat = " + minFloat);
        System.out.println("maxFloat = " + maxFloat);
        System.out.println("minDouble = " + minDouble);
        System.out.println("maxDouble = " + maxDouble);
        System.out.println("overflow = " + overflow);

    }
}