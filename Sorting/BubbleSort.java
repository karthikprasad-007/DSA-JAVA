package Sorting;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 1, 2, 5, -1, 8, 0, -7, 10, 0, 12, 6};
        bubbleSort(arr);
        display(arr);
    }

    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr.length - i - 1; ++j) {
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
