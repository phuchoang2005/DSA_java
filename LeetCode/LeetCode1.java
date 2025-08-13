import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> container = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (container.containsKey(diff)) {
                return new int[] { i, container.get(diff) };
            }
            container.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void export(int[] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        Solution.export(Solution.twoSum(nums, target));
    }
}