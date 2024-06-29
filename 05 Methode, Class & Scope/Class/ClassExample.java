package Class;
public class ClassExample {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Setiap file Java harus memiliki paling tidak satu class
        // Dalam satu file java hanya boleh ada satu class dengan acces public
        // Nama file Java harus sama dengan nama class public yang terdapat di dalamnya
        // Satu class dapat terdiri dari beberapa methode, variabel, blok inisialisasi, dan konstruktor

        // Struktur Dasar Class
        // acces modifier className {
            // body of the class
        // }

        // Acces
        // public (Dapat diakses dari mana saja)
        // default (Dapat diakses dalam paket yang sama)
        // private (Hanya dapat diakses dalam class yang sama)
        // protected (Dapat diakses dalam paket yang sama dan oleh subclassnya)

        // Modifier
        // static (Elemen tersebut milik class, bukan objek individual)
        // final (Elemen tidak dapat diubah setelah didefinisikan)
        // abstract (class tidak dapat diinstansiasi atau metode tidak memiliki implementasi)
        // and more...
    }
}