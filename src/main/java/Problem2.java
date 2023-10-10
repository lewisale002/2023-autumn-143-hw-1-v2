public class Problem2 {

    // Do not change signature (function name, parameters, return type)
    public static void bubbleSort(int[] data) {
        if (data == null || data.length < 2) {
            return;
        }

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }

    //An array of size n will compare the values of the array (n^2 - n) / 2 times, and make up to that many swaps

    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
