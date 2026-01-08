package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 1, 2, 5, -1, 8, 0, -7, 10, 0, 12, 6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //O(n^2) time complexity
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; ++i) {
            int max = 0;
            for(int j = 1; j < n - i; ++j) {
                if(arr[j] > arr[max]) max = j;
            }
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[max];
            arr[max] = temp;
        }
    }
}
