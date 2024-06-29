import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Exception Handling
        // 1. Menangani Runtime Errors
        // 2. Error yang sering terjadi (Incorrect input, Pembagian dengan 0, Melebihi batas index array)
        // 3. Menggunakan try catch

        Scanner scanner = new Scanner(System.in);
        // System.out.print("Masukkan angka: ");
        
        // if(scanner.hasNextInt()) {
        //     int number = scanner.nextInt();
        //     System.out.println("Angka yang dimasukkan: " + number);
        // } else {
        //     System.out.println("Input tidak valid. Harap masukkan angka.");
        // }

        // scanner.close();

        System.out.print("Masukkan angka: ");
        

        try {
            int number = scanner.nextInt();
            System.out.println("Angka yang dimasukkan: " + number);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        } finally {
            scanner.close();
        }
    }
}
