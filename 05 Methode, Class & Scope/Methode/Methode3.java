// OVERLOADING METHODE
public class Methode3 {
    public static void main(String[] args) {
        System.out.println(add(5, 3));       // Memanggil metode add(int, int)
        System.out.println(add(5.5, 3.5));   // Memanggil metode add(double, double)
    }
    
    // Overloading metode add untuk integer
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Overloading metode add untuk double
    public static double add(double a, double b) {
        return a + b;
    }
}
