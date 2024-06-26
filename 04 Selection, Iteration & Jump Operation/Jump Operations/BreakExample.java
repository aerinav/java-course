public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Keluar dari loop saat i sama dengan 5
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop selesai.");
    }
}
