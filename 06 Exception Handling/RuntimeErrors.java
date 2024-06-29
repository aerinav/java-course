public class RuntimeErrors {
    public static void main(String[] args) {
        int result = 10 / 0; // Pembagian dengan penyebut 0
        System.out.println(result);

        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // Melebihi batas index array

        String str = null;
        System.out.println(str.length()); // Null pointer exception
    }
}
    

