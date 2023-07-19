import java.util.Scanner;
public class ArrayManioulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the array size
        int N = scanner.nextInt();
        // Create an array to store the elements
        int[] A = new int[N + 1];
        // Read the array elements
        for (int i = 1; i <= N; i++) {
            A[i] = scanner.nextInt();
        }
        // Compute the prefix sum array
        int[] prefixSum = new int[N + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        // Read the number of queries
        int Q = scanner.nextInt();
        // Process the queries
        for (int i = 0; i < Q; i++) {
            int U = scanner.nextInt();
            int V = scanner.nextInt();
            // Calculate the sum of the subarray
            int sum = prefixSum[V] - prefixSum[U - 1];
            // Print the result
            System.out.println(sum);
        }
        scanner.close();
    }
}
