public class Methode {
    public static void main(String[] args) {
        sayHello();  // Memanggil methode sayHello
        greetUser("John Doe"); // Memanggil methode greetUser()

        int result = add(5, 3);  // Memanggil metode add() dengan dua parameter
        System.out.println("Hasil penjumlahan: " + result);
    }

    // Struktur Dasar Methode
    // acces modifier returnType methodName(parameters) {
         // body of the method
    // }

    // Acces
    // public (Dapat diakses dari mana saja)
    // default (Dapat diakses dalam paket yang sama)
    // private (Hanya dapat diakses dalam kelas yang sama)
    // protected (Dapat diakses dalam paket yang sama dan oleh subclassnya)

    // Modifier
    // static (Elemen tersebut milik kelas, bukan objek individual)
    // final (Elemen tidak dapat diubah setelah didefinisikan)
    // abstract (Kelas tidak dapat diinstansiasi atau metode tidak memiliki implementasi)
    // and more...

    // Return Type
    // 1. Void (Tidak Mengembalikan Nilai)
    // 2. Tipe Data Primitif (int, double, char, dll.)
    // 3. Tipe Data Non-Primitif (String, Arrays, objek, dll.)
    
    // Simple Methode
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    // Methode void dengan satu parameter
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Methode String dengan satu parameter
    public static String greetUser2(String name) {
        return "Hello, " + name + "!";
    }

    // Methode int dengan dua parameter
    public static int add(int a, int b) {
        return a + b;
    }
}
