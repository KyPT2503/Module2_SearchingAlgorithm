public class Solution {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int n = 3;
        System.out.println(getIndex(ints, n));
        System.out.println(binarySearch(ints, n));
    }

    private static int getIndex(int[] ints, int n) {
        int index = -1;
        int low = 0, high = ints.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (n < ints[middle]) {
                high = middle - 1;
            } else if (n > ints[middle]) {
                low = middle + 1;
            } else {
                index = middle;
                break;
            }
        }
        return index;
    }

    private static int binarySearch(int[] ints, int n) {
        return binarySearch(ints, n, 0, ints.length - 1);
    }

    private static int binarySearch(int[] ints, int n, int low, int high) {
        if (low > high) return -1;
        int middle = (low + high) / 2;
        if (n < ints[middle]) return binarySearch(ints, n, low, middle - 1);
        if (n > ints[middle]) return binarySearch(ints, n, middle + 1, high);
        return middle;
    }
}
