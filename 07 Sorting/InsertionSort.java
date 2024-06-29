public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array sebelum diurutkan");
        for(int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();

        InsertionAscending(arr);
        System.out.println("Array setelah diurutkan (Ascending)");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();

        InsertionDescending(arr);
        System.out.println("Array setelah diurutkan (Descending)");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void InsertionAscending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            for(int j = i-1; (j >= 0) && (arr[j] > temp); j--) {
                arr[j+1] = arr[j];
                arr[j+1] = temp;
            }
        }
    }

    public static void InsertionDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            for(int j = i-1; (j >= 0) && (arr[j] < temp); j--) {
                arr[j+1] = arr[j];
                arr[j+1] = temp;
            }
        }
    }
}
