public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array sebelum diurutkan");
        for(int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();

        BubbleAscending(arr);
        System.out.println("Array setelah diurutkan (Ascending)");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();

        BubbleDescending(arr);
        System.out.println("Array setelah diurutkan (Descending)");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void BubbleAscending(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            for(int j = n-1; j >= i; j--) {
                if(arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                }
            }
        }
    }

    public static void BubbleDescending(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            for(int j = n-1; j >= i; j--) {
                if(arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
