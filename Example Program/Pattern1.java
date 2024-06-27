public class Pattern1 {
    public static void main(String[] args) {
        int rows = 5; // Jumlah baris untuk pola
        
        // Loop untuk mengatur baris
        for (int i = rows; i >= 1; i--) {
            
            // Loop untuk mencetak bintang dalam satu baris
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
