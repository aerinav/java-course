public class OOP {
    // Konsep OOP
        // 1. Kelas dan Objek: Kelas adalah cetak biru untuk membuat objek. Objek adalah instance dari kelas.
        // 2. Pewarisan (Inheritance): Mekanisme di mana satu kelas mewarisi atribut dan metode dari kelas lain.
        // 3. Polimorfisme (Polymorphism): Kemampuan berbagai kelas untuk diperlakukan sebagai instance dari kelas yang sama melalui pewarisan.
        // 4. Enkapsulasi (Encapsulation): Penggabungan data dengan metode yang mengoperasikan data tersebut.
        // 5. Abstraksi (Abstraction): Konsep menyembunyikan detail implementasi yang kompleks dan hanya menampilkan fitur yang diperlukan.

    public static void main(String[] args) {
        // Membuat objek mahasiswa baru
        Mahasiswa mahasiswa = new Mahasiswa("12345678", "Budi", "MIPA", "Ilmu Komputer");

        // Menampilkan data mahasiswa
        mahasiswa.tampilkanDataMahasiswa();

        // Mengubah data mahasiswa menggunakan setter
        mahasiswa.setNim("87654321");
        mahasiswa.setNama("Andi");
        mahasiswa.setFakultas("Teknik");
        mahasiswa.setProdi("Teknik Informatika");

        // Menampilkan data mahasiswa setelah perubahan
        mahasiswa.tampilkanDataMahasiswa();
    }
}

class Mahasiswa {
    // Atribut (fields)
    private String nim;
    private String nama;
    private String fakultas;
    private String prodi;

    // Konstruktor
    public Mahasiswa(String nim, String nama, String fakultas, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }

    // Metode getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getProdi() {
        return prodi;
    }

    // Metode setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Metode untuk menampilkan data mahasiswa
    public void tampilkanDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Prodi: " + prodi);
    }
}

