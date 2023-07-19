import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class NextLargeNumber {
    public static int[] findNextLargerNumbers(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize the output array with -1
        Deque<Integer> stack = new ArrayDeque<>(); // Use a stack to store potential next larger numbers
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 6, 8, 7};
        int[] result = findNextLargerNumbers(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " -> " + (result[i] != -1 ? result[i] : "None"));
        }
    }
}
