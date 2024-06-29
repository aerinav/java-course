public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array sebelum diurutkan:");
        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        MergeAscending(arr, 0, arr.length - 1);
        System.out.println("Array setelah diurutkan (Ascending):");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        MergeDescending(arr, 0, arr.length - 1);
        System.out.println("Array setelah diurutkan (Descending):");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void MergeAscending(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            MergeAscending(arr, left, mid);
            MergeAscending(arr, mid+1, right);

            merge(arr, left, mid, right, true);
        }
    }

    public static void MergeDescending(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            MergeDescending(arr, left, mid);
            MergeDescending(arr, mid+1, right);

            merge(arr, left, mid, right, false);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, boolean ascending) {
        int n1 = mid - left+1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left+i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid+1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (ascending ? L[i] <= R[j] : L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
