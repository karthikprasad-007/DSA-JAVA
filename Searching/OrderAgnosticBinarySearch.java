public class OrderAgnosticBinarySearch {
    
    public static void main (String[] args) {
        int[] arr1 = {1, 3, 5, 8, 12, 15};      // ascending
        int[] arr2 = {20, 17, 13, 10, 5, 1};    // descending

        System.out.println(orderAgnosticBinarySearch(arr1, 8));  
        System.out.println(orderAgnosticBinarySearch(arr2, 13)); 
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {

        if(arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target == arr[mid]) return mid;

            if(isAsc) {
                if(target > arr[mid]) start = mid + 1;
                else end = mid - 1;
            } else {
                if(target < arr[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }

        return -1;
    }
}

