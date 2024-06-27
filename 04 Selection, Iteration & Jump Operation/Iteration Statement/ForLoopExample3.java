public class ForLoopExample3 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Durian"};

        // Menggunakan for biasa
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit: " + fruits[i]);
        }

        // Menggunakan foreach
        for (String buah : fruits) {
            System.out.println("Buah: " + buah);
        }
    }
}
