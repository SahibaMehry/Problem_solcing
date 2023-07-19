import java.util.Arrays;

public class Loghartmic {
    public static void exampleMethod(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        exampleMethod(arr);

        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}

