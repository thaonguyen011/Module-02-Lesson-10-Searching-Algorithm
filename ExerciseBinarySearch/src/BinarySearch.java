public class BinarySearch {

    public static int binarySearch(int[] array, int left, int right, int value) {
        left = 0;
        right = array.length - 1;
        if (value < array[0] || value > array[right]) return -1;
        while (left <= right) {
            int middle = left + (right - left)/2;
            if (array[middle] == value) return middle;
            else if (array[middle] < value) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }

    public static int binarySearch01(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = left + (right - left)/2;
            if (array[middle] == value) return middle;
            else if (array[middle] > value) {
                right = middle - 1;
                return binarySearch01(array, left, right, value);
            } else {
                left = middle + 1;
                return binarySearch01(array, left, right, value);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 7, 10};
        System.out.println(binarySearch(array, 0, 6, 3));


        System.out.println(binarySearch01(array, 0, 6, 1));
    }
}
