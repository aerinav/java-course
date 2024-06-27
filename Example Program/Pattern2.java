import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan baris");
        int rows = scanner.nextInt(); // Jumlah baris untuk pola
        
        // Loop untuk mengatur baris
        for (int i = 1; i <= rows; i++) {
            
            // Loop untuk mencetak angka dalam satu baris
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Pindah ke baris berikutnya
            System.out.println();
        }
        scanner.close();
    }
}
