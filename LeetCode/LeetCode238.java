class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int prefix = 1;
        output[0] = prefix;
        for (int i = 1; i < output.length; i++) {
            prefix *= nums[i - 1];
            output[i] = prefix;
        }
        int postfix = 1;
        output[output.length - 1] *= postfix;
        for (int i = output.length - 2; i >= 0; i--) {
            postfix *= nums[i + 1];
            output[i] *= postfix;
        }
        return output;
    }

    public static void export(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

public class LeetCode238 {
    public static void main(String[] args) {
        Solution.export(Solution.productExceptSelf(new int[] { -1, 1, 0, -3, 3 }));
    }
}