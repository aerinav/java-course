public class VariabelDanTipeData2 {
    public static void main(String[] args) {
        // Tipe data non-primitif dan kelas wrapper
        String str = "Hello World";         // Tipe data String (Kumpulan karakter)
        int[] arrayInt = {1, 2, 3, 4, 5};   // Tipe data Array (Kumpulan elemen dengan tipe data yang sama)

        // Kelas Wrapper (Setiap tipe data primitif memeiliki kelas wrapper)
        Byte angkaMini = 127;                   // Kelas Wrapper byte (Bilangan bulat mini)
        Short angkaKecil = 128;                 // Kelas Wrapper short (Bilangan bulat kecil)
        Integer angkaBulat = 32768;             // Kelas Wrapper integer (Bilangan bulat)
        Long angkaBesar = 2147483L;             // Kelas Wrapper long (Bilangan bulat besar)
        Float angkaDesimal = 3.14f;             // Kelas Wrapper float (Bilangan desimal)
        Double angkaDesimalBesar = 3.14159265;  // Kelas Wrapper double (Bilangan desimal lebih presisi)
        Character karakter = 'A';               // Kelas Wrapper char (Karakter tunggal)
        Boolean isBenar = true; 

        System.out.println("Nilai dari variabel 'angkaMini' adalah: " + angkaMini);
        System.out.println("Nilai dari variabel 'angkaKecil' adalah: " + angkaKecil);
        System.out.println("Nilai dari variabel 'angkaBulat' adalah: " + angkaBulat);
        System.out.println("Nilai dari variabel 'angkaBesar' adalah: " + angkaBesar);
        System.out.println("Nilai dari variabel 'angkaDesimal' adalah: " + angkaDesimal);
        System.out.println("Nilai dari variabel 'angkaDesimalBesar' adalah: " + angkaDesimalBesar);
        System.out.println("Nilai dari variabel 'karakter' adalah: " + karakter);
        System.out.println("Nilai dari variabel 'isBenar' adalah: " + isBenar);
        System.out.println("Nilai dari variabel 'str' adalah: " + str);
        System.out.println("Nilai dari variabel 'arrayInt' adalah: " + arrayInt);
    }
}
