public class BiotonicArray {
    
    public static void main(String[] args) {
        int[] arr = {1, 7, 6, 5, 2, -1};
        System.out.println(find(arr, 6));
    }

    static int find(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int p = pivot(arr);
        int ans = search(arr, target, start, p);
        if(ans == -1) return search(arr, target, p, end);
        return ans;
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) end = mid;
            else start = mid + 1;
        }

        return start;
    }

    static int search(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;

            if(isAsc){
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
