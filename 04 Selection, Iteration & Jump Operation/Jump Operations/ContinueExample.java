public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Melewati iterasi saat i adalah bilangan genap
            }
            System.out.println("i: " + i);
        }
    }
}
