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
        int d = 10, o = 10, p = 10, q = 10, r = 10;

        r++; // 11
        r++; // 12
        r++; // 13
        r--; // 12
        // d = d + 1;
        // d = d - 1;
        int w = d++;
        System.out.println(d); // Hasilnya = 10 + 1
        System.out.println(w); // Hasilnya = 10

        int x = ++o;
        System.out.println(o); // Hasilnya = 10 + 1
        System.out.println(x); // Hasilnya = 11
        
        int y = p--;
        System.out.println(p); // Hasilnya = 10 - 1
        System.out.println(y); // Hasilnya = 10

        int z = --q;
        System.out.println(q); // Hasilnya = 10 - 1
        System.out.println(z); // Hasilnya = 9

        // 3. Operator Penugasan
        int e = 15;
        
        e = e + 5;
        e += 5;

        int angkaA = 20;

        angkaA = angkaA - 50;
        angkaA -= 50;

        // 4. Operator Pembanding
        int f = 10, g = 10;
        System.out.println(f == g);     // true
        System.out.println(f != g);     // false
        System.out.println(f > g);      // false
        System.out.println(f < g);      // false
        System.out.println(f >= g);     // true
        System.out.println(f <= g);     // true

        // 5. Operator Logika
        boolean h = true, i = false;
        System.out.println(h && i);     // false
        System.out.println(h || i);     // true
        System.out.println(!i);         // true

        // && Bernilai true jika kedua variabel bernilai true
        // || Bernila true jika terdapat minimal satu variabel bernilai true
        // '!' Bernila kebalikan dari nilai variabel 
    }
}
