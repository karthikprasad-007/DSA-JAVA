public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 5, 5, 5, 6, 9};
        System.out.println(floor(arr, 1));

    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return end;
    }
}
