import java.util.Scanner;
public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println(number + " adalah bilangan positif");
        } else {
            System.out.println(number + " bukan bilangan positif");
        }

        scanner.close();
    }
}
