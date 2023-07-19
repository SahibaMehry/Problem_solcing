public class timecomplexity{
    public static void exampleMethod(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        exampleMethod(arr);
    }
}
