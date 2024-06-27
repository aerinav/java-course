package Class;
public class ClassExample2 {
    public static void main(String[] args) {
        int add = Calculator.add(10, 5);
        System.out.println("Hasil penjumlahan: " + add);

        int substract = Calculator.substract(20, 5);
        System.out.println("Hasil pengurangan: " + substract);

        int multiply = Calculator.multiply(5, 10);
        System.out.println("Hasil perkalian: " + multiply);

        int divide = Calculator.divide(25, 5);
        System.out.println("Hasil pembagian: " + divide);

        int modulus = Calculator.modulus(7, 51);
        System.out.println("Hasil modulus: " + modulus);
    }
}

class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }
}
