public class NestedFor {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris

        // Loop untuk mengatur baris
        for (int i = 1; i <= n; i++) {

            // Loop untuk mencetak bintang dalam satu baris
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }

            System.out.println();
        }
    }
}
