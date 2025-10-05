class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < 2 || nums[j - 2] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}