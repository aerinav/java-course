public class ForLoopExample3 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        // Menggunakan for biasa
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit: " + fruits[i]);
        }

        // Menggunakan foreach
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
