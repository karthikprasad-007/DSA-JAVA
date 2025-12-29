package Sorting;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 1, 2, 5, -1, 8, 0, -7, 10, 0, 12, 6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            boolean isSorted = true;
            for(int j = 1; j < arr.length - i; ++j) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
    }
}
