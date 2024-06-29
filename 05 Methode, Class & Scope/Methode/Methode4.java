// Methode Rekursif
public class Methode4 {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);  // Memanggil metode factorial
        System.out.println("Factorial of " + number + " is: " + result);
    }
    
    // Definisi metode rekursif untuk menghitung faktorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); //  Sistem iterasi dengan methode bukan for
        }
    }
}
