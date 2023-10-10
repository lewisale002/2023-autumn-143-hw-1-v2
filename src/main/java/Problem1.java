public class Problem1 {
    public static int binarySearch(int[] data, int target) {
        if (data == null || data.length == 0) {
            return -1;
        }

        int start = 0, end = (data.length - 1); //start and end points of array

        while (start <= end) {
            int middle = start + ((end - start) / 2); //the midpoint of the array
            if (data[middle] == target) {
                return middle;
            }
            else if (data[middle] > target) {
                end = (middle - 1);
            }
            else {
                start = (middle + 1);
            }
        }

        return -1; //target not found
    }

}