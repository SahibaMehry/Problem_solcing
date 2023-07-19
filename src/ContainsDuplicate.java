import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};  // Example input array
        boolean hasDuplicates = containsDuplicate(nums);
        System.out.println("Array contains duplicates: " + hasDuplicates);
    }
}
