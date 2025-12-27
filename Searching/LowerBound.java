public class LowerBound {
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8};
        System.out.println(lowerBound(arr, 1));
    }

    static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }

        return start;
    
    }
}