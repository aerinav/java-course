
public class TypeCastingString {
    public static void main(String[] args) {
        // Mengonversi dari String ke Tipe Data Primitif Menggunakan Metode Parsing
        String strAngkaMini = "127";                   
        String strAngkaKecil = "128";                 
        String strAngkaBulat = "32768";                
        String strAngkaBesar = "76587787";            
        String strAngkaDesimal = "3.14";             
        String strAngkaDesimalBesar = "3.14159265";  
        String strIsBenar = "true";  

        // Mengonversi dari String ke tipe primitif
        byte angkaMini = Byte.parseByte(strAngkaMini);                   
        short angkaKecil = Short.parseShort(strAngkaKecil);                 
        int angkaBulat = Integer.parseInt(strAngkaBulat);                 
        long angkaBesar = Long.parseLong(strAngkaBesar);             
        float angkaDesimal = Float.parseFloat(strAngkaDesimal);             
        double angkaDesimalBesar = Double.parseDouble(strAngkaDesimalBesar);  
        boolean isBenar = Boolean.parseBoolean(strIsBenar); 

        System.out.println("byte dari String: " + angkaMini);
        System.out.println("short dari String: " + angkaKecil);
        System.out.println("int dari String: " + angkaBulat);
        System.out.println("long dari String: " + angkaBesar);
        System.out.println("folat dari String: " + angkaDesimal);
        System.out.println("double dari String: " + angkaDesimalBesar);
        System.out.println("boolean dari String: " + isBenar);
    }
}