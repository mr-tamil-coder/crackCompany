class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(robHelper(nums, 0, n - 2),robHelper(nums, 1,n - 1));
    }

    private int robHelper(int nums[], int start, int end) {
        int len = end - start + 1;
         if (len == 1) {
            return nums[start];
        }
        int dp[] = new int[len];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[start + i], dp[i - 1]);
        }
        // System.out.println(Arrays.toString(dp));
        return dp[len-1];
    }
}