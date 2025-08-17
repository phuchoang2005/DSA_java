import java.util.HashSet;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> container = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (!container.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static void export(int[] nums) {
        System.out.println(containsDuplicate(nums) ? "true" : "false");
    }
}

public class LeetCode217 {
    public static void main(String[] args) {
        Solution.export(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 });
    }
}