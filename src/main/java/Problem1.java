public class Problem1 {
    public static int binarySearch(int[] data, int target) {
        if (data == null || data.length == 0) {
            return -1;
        }

        int start = 0, end = (data.length - 1);

        while (start <= end) {
            int mid = ((start + end) / 2);
            if (data[mid] == target) {
                return mid;
            }
            else if (data[mid] > target) {
                end = (mid - 1);
            }
            else {
                start = (mid + 1);
            }
        }

        return -1;
    }

}