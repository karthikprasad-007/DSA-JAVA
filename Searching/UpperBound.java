public class UpperBound {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 6, 7};
        System.out.println(upperBound(arr, 7));
    }

    static int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[end] <= target) return -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }

        return start;
    }
}
