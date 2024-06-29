public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array sebelum diurutkan");
        for(int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();

        SelectionAscending(arr);
        System.out.println("Array setelah diurutkan (Ascending)");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();

        SelectionDescending(arr);
        System.out.println("Array setelah diurutkan (Descending)");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void SelectionAscending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int minIndex = i;
            for (int j = i; j < n-1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    swap(arr, minIndex, minIndex);
                }
            } 
        }
    }

    public static void SelectionDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int minIndex = i;
            for (int j = i; j < n-1; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                    swap(arr, minIndex, minIndex);
                }
            } 
        }
    }

    public static void swap(int[] arr, int minIndex, int i) {
        int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
    }
}
