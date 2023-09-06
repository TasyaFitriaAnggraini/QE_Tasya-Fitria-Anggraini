public class Calculator {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        int sum = add(num1, num2);
        int difference = substract (15, 4);
        int product = multiply(10, 10);
        int quotient = divide(12, 3);

        System.out.println("Penjumlahan: " + sum);
        System.out.println("Pengurangan: " + difference);
        System.out.println("Perkalian: " + product);
        System.out.println("Pembagian: " + quotient);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int substract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
