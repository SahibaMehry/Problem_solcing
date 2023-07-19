public class lowerBound {
    public static int lowerBound(int[] A, int key) {
        int left = 0;
        int right = A.length - 1;
        int pos = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (A[mid] >= key) {
                pos = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return pos;
    }
    public static void main(String[] args) {
        int[] A = {-1, -1, 4, 4, 4, 6, 7};
        int key = 4;
        int result = lowerBound(A, key);
        System.out.println("pos: " + result);
    }
}
