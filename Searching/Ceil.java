public class Ceil {
    
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11};
        System.out.println(ceil(arr, 11));
    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target >= arr[end]) return -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }

        return start;
    }
}
