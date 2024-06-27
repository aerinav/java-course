import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int number = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }

        System.out.println("Faktorial dari " + number + " adalah: " + factorial);

        scanner.close();
    }
}
