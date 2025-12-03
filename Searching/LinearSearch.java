package Searching;  

public class LinearSearch {
    
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 0, -1, 4};
        int target = 0;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; ++i) {
            if(arr[i]==target) return i;
        }
        return -1;
    }
}