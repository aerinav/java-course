public class Inheritance {
    public static void main(String[] args) {
        // Membuat objek mahasiswa baru
        Mahasiswa mahasiswa = new Mahasiswa("Budi", 20, "12345678", "MIPA", "Ilmu Komputer");

        // Menampilkan data mahasiswa
        mahasiswa.tampilkanDataMahasiswa();

        // Mengubah data mahasiswa menggunakan setter
        mahasiswa.setNama("Andi");
        mahasiswa.setUmur(21);
        mahasiswa.setNim("87654321");
        mahasiswa.setFakultas("Teknik");
        mahasiswa.setProdi("Teknik Informatika");

        // Menampilkan data mahasiswa setelah perubahan
        mahasiswa.tampilkanDataMahasiswa();
    }
}

class Person {
    // Atribut (fields)
    private String nama;
    private int umur;

    // Konstruktor
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Metode setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Metode untuk menampilkan data person
    public void tampilkanDataPerson() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class Mahasiswa extends Person {
    // Atribut tambahan (fields)
    private String nim;
    private String fakultas;
    private String prodi;

    // Konstruktor
    public Mahasiswa(String nama, int umur, String nim, String fakultas, String prodi) {
        super(nama, umur); // Memanggil konstruktor kelas induk (Person)
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }

    // Metode getter
    public String getNim() {
        return nim;
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

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Metode untuk menampilkan data mahasiswa
    public void tampilkanDataMahasiswa() {
        super.tampilkanDataPerson(); // Memanggil metode dari kelas induk (Person)
        System.out.println("NIM: " + nim);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Prodi: " + prodi);
    }
}

