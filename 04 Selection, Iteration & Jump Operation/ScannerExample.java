import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Mengambil input berupa string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Mengambil input berupa integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Mengambil input berupa doublejaba
        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();
        
        // Menampilkan input yang telah diambil
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        
        // Menutup scanner
        scanner.close();

        // Pasangan Scanner dan Tipe Data
        // next() -> Tipe data String satu karakter
        // nextLine() -> Tipe data String
        // nextByte() -> Tipe data byte
        // nextShort() -> Tipe data short
        // nextInt() -> Tipe data int
        // nextLong() -> Tipe data long
        // nextFloat() -> Tipe data float
        // nextDouble() -> Tipe data double
        // nextBoolean() -> Tipe data boolean
    }
}
