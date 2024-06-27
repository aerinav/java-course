import java.util.Scanner;

public class Methode2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas bilangan: ");
        int limit = scanner.nextInt();

        // Memanggil metode untuk mendapatkan array bilangan prima
        int[] primeNumbers = generatePrimes(limit);

        System.out.println("Bilangan prima hingga " + limit + " adalah:");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }

        scanner.close();
    }

    // Metode dengan tipe pengembalian array int
    public static int[] generatePrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int factor = 2; factor * factor <= limit; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor * j <= limit; j++) {
                    isPrime[factor * j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) count++;
        }

        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) primes[index++] = i;
        }

        return primes;
    }
}
