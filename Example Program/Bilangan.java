import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Bilangan genap (Even number)");
        } else {
            System.out.println("Bilangan ganjil (Odd number)");
        }
        
        scanner.close();
    }
}