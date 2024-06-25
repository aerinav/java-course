
public class TypeCastingString2 {
    public static void main(String[] args) {
        // Mengonversi dari String ke Tipe Data Primitif Menggunakan Metode valueOf
        String strAngkaMini = "127";                   
        String strAngkaKecil = "128";                 
        String strAngkaBulat = "32768";                
        String strAngkaBesar = "76587787";            
        String strAngkaDesimal = "3.14";             
        String strAngkaDesimalBesar = "3.14159265";  
        String strIsBenar = "true";  
        
        // Mengonversi dari String ke objek wrapper
        Byte byteObj = Byte.valueOf(strAngkaMini);
        Short shortObj = Short.valueOf(strAngkaKecil);
        Integer intObj = Integer.valueOf(strAngkaBulat);
        Long longObj = Long.valueOf(strAngkaBesar);
        Float floatObj = Float.valueOf(strAngkaDesimal);
        Double doubleObj = Double.valueOf(strAngkaDesimalBesar);
        Boolean booleanObj = Boolean.valueOf(strIsBenar);

        byte angkaMini = byteObj.byteValue();                   
        short angkaKecil = shortObj.shortValue();                 
        int angkaBulat = intObj.intValue();                 
        long angkaBesar = longObj.longValue();             
        float angkaDesimal = floatObj.floatValue();             
        double angkaDesimalBesar = doubleObj.doubleValue();  
        boolean isBenar = booleanObj.booleanValue(); 

        // Mendapatkan nilai primitif dari objek wrapper
        System.out.println("byte dari String (via objek): " + angkaMini);
        System.out.println("short dari String (via objek): " + angkaKecil);
        System.out.println("int dari String (via objek): " + angkaBulat);
        System.out.println("long dari String (via objek): " + angkaBesar);
        System.out.println("folat dari String (via objek): " + angkaDesimal);
        System.out.println("double dari String (via objek): " + angkaDesimalBesar);
        System.out.println("boolean dari String (via objek): " + isBenar);
    }
}