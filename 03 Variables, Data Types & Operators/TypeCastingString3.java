public class TypeCastingString3 {
    public static void main(String[] args) {
        // Mengonversi dari Tipe Data Primitif atau Objek ke String
        byte angkaMini = 127;                   
        short angkaKecil = 128;                 
        int angkaBulat = 32768;                 
        long angkaBesar = 76587787L;            
        float angkaDesimal = 3.14f;             
        double angkaDesimalBesar = 3.14159265;  
        boolean isBenar = true;

        // Menggunakan Metode String.valueOf()
        String strAngkaMini = String.valueOf(angkaMini);                   
        String strAngkaKecil = String.valueOf(angkaKecil);                 
        String strAngkaBulat = String.valueOf(angkaBulat);                
        String strAngkaBesar = String.valueOf(angkaBesar);            
        String strAngkaDesimal = String.valueOf(angkaDesimal);             
        String strAngkaDesimalBesar = String.valueOf(angkaDesimalBesar);  
        String strIsBenar = String.valueOf(isBenar);  

        System.out.println("String dari byte: " + strAngkaMini);
        System.out.println("String dari short: " + strAngkaKecil);
        System.out.println("String dari int: " + strAngkaBulat);
        System.out.println("String dari long: " + strAngkaBesar);
        System.out.println("String dari float: " + strAngkaDesimal);
        System.out.println("String dari double: " + strAngkaDesimalBesar);
        System.out.println("String dari boolean: " + strIsBenar);

        // Menggunakan Operator + ""
        strAngkaMini = angkaMini + "";                   
        strAngkaKecil = angkaKecil + "";                 
        strAngkaBulat = angkaBulat + "";                
        strAngkaBesar = angkaBesar + "";            
        strAngkaDesimal = angkaDesimal + "";             
        strAngkaDesimalBesar = angkaDesimalBesar + "";  
        strIsBenar = isBenar + ""; 

        System.out.println("String dari byte: " + strAngkaMini);
        System.out.println("String dari short: " + strAngkaKecil);
        System.out.println("String dari int: " + strAngkaBulat);
        System.out.println("String dari long: " + strAngkaBesar);
        System.out.println("String dari float: " + strAngkaDesimal);
        System.out.println("String dari double: " + strAngkaDesimalBesar);
        System.out.println("String dari boolean: " + strIsBenar);
    }
}

