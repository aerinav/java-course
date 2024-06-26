public class ReturnExample {
    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 3) {
                return; // Keluar dari metode saat i sama dengan 3
            }
            System.out.println("i: " + i);
        }
        System.out.println("Metode selesai.");
    }
}
