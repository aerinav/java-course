public class Array {
    public static void main(String[] args) {
        // Array Satu Dimensi
        // Inisialisasi Lansung
        int[] array1 = {5, 8, 11, 9, 1};
        System.out.println(array1[2]);

        // Inisialisasi Manual
        int[] array2 = new int[2];
        array2[0] = 10;
        array2[1] = 20;
        System.out.println(array2[0] + array2[1]);

        // Array Dua Dimensi
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.println("Matriks[" + i + "][" + j + "] = " + matriks[i][j]);
            }
        }
    }
}
