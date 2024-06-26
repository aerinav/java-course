public class VariabelDanTipeData {
    public static void main(String[] args) {
        // Deklarasi & Inisialisasi variabel tipe data primitif
        byte angkaMini = 127;                   // Tipe data byte (Bilangan bulat mini) Range (-128 to 127) Bit (8)
        short angkaKecil = 128;                 // Tipe data short (Bilangan bulat kecil) Range (-32768 to 32767) Bit (16)
        int angkaBulat = 32768;                 // Tipe data integer (Bilangan bulat) Range (-2147483648 to 2147483647) Bit (32)
        long angkaBesar = 76587787L;             // Tipe data long (Bilangan bulat besar) Range (-2^(63) to 2^(63)-1) Bit (64)
        float angkaDesimal = 3.14f;             // Tipe data float (Bilangan desimal) Bit (32)
        double angkaDesimalBesar = 3.14159265;  // Tipe data double (Bilangan desimal lebih presisi) Bit (64)
        
        char karakter = 'A';                    // Tipe data char (Karakter tunggal)
        boolean isBenar = true;                 // Tipe data boolean (True atau False)

        // Menampilkan nilai variabel ke layar
        System.out.println("Nilai dari variabel 'angkaMini' adalah: " + angkaMini);
        System.out.println("Nilai dari variabel 'angkaKecil' adalah: " + angkaKecil);
        System.out.println("Nilai dari variabel 'angkaBulat' adalah: " + angkaBulat);
        System.out.println("Nilai dari variabel 'angkaBesar' adalah: " + angkaBesar);
        System.out.println("Nilai dari variabel 'angkaDesimal' adalah: " + angkaDesimal);
        System.out.println("Nilai dari variabel 'angkaDesimalBesar' adalah: " + angkaDesimalBesar);
        System.out.println("Nilai dari variabel 'karakter' adalah: " + karakter);
        System.out.println("Nilai dari variabel 'isBenar' adalah: " + isBenar);
    }
}