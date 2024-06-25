public class Operators {
    public static void main(String[] args) {
        // Jenis-jenis operators
        // 1. Operator Aritmatika
        // 2. Operator Increment & Decrement
        // 3. Operator Penugasan
        // 4. Operator Pembanding
        // 5. Operator Logika
        // 6. Operator Bitwise
        // 7. Operator Ternary

        // 1. Operator Aritmatika
        int a, b, c;
        a = 25;
        b = 7;

        c = a + b;  // Penjumlahan
        c = a - b;  // Pengurangan
        c = a * b;  // Perkalian
        c = a / b;  // Pembagian
        c = b % a;  // Modulus

        c = a - b * (a + b) / 8;
        System.out.println( c);

        // 2. Operator Increment & Decrement
        int d = 10;

        d = d + 1;

        // 3. Operator Penugasan
        int e = 15;
        
        e = e + 5;

        // 4. Operator Pembanding
        int f = 10, g = 20;
        System.out.println(f == g);     // false
        System.out.println(f != g);
        System.out.println(f > g);
        System.out.println(f < g); 
        System.out.println(f >= g); 
        System.out.println(f <= g); 

        // 5. Operator Logika
        boolean h = true, i = false;
        System.out.println(h && i);     // false
        System.out.println(h || i);     // 
        System.out.println(!h);         // 
    }
}
