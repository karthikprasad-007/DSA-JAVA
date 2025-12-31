package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 1, 2, 5, -1, 8, 0, -7, 10, 0, 12, 6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length - 1;
        int k = 0;
        for(int i = 0; i <= n; ++i) {
            int max = arr[0];
            for(int j = 0; j <= n - i - 1; ++j) {
                if(arr[j] >= max) {
                    k = j;
                    max = arr[j];
                }
            }
            int temp = arr[n-i];
            arr[n-i] = max;
            arr[k] = temp;
        }
    }
}
