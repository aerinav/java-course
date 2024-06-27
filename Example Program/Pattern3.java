public class Pattern3 {
    public static void main(String[] args) {
        int rows = 5; // Jumlah baris untuk pola
        
        // Loop untuk mengatur baris
        for (int i = 1; i <= rows; i++) {
            
            // Loop untuk mencetak spasi sebelum bintang
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            
            // Loop untuk mencetak bintang dalam satu baris
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
