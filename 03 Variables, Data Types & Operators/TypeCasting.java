public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        byte b = 10;
        int i = b; // byte ke int
        long l = i; // int ke long
        float f = l; // long ke float
        double d = f; // float ke double

        System.out.println("Nilai byte: " + b);
        System.out.println("Nilai int setelah implicit casting: " + i);
        System.out.println("Nilai long setelah implicit casting: " + l);
        System.out.println("Nilai float setelah implicit casting: " + f);
        System.out.println("Nilai double setelah implicit casting: " + d);

        // Explicit casting (narrowing)
        double doubleValue = 9.78;
        float floatValue = (float) doubleValue; // double ke float
        long longValue = (long) floatValue; // float ke long
        int intValue = (int) longValue; // long ke int
        byte byteValue = (byte) intValue; // int ke byte

        System.out.println("Nilai double: " + doubleValue);
        System.out.println("Nilai float setelah explicit casting: " + floatValue);
        System.out.println("Nilai long setelah explicit casting: " + longValue);
        System.out.println("Nilai int setelah explicit casting: " + intValue);
        System.out.println("Nilai byte setelah explicit casting: " + byteValue);
    }
}
