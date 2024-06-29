public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // Mencoba memanggil metode dengan nilai yang menyebabkan exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Metode yang melempar exception jika kondisi tertentu terpenuhi
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older."); // Melempar exception
        } else {
            System.out.println("Age is valid.");
        }
    }
}
