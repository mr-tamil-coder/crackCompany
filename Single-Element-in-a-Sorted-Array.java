class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0,right = nums.length-1;
        while(left<right){
            int mid = left + (right - left)/2;
            boolean isRightHalf = mid % 2 == 0 ? nums[mid] == nums[mid+1] : nums[mid] == nums[mid-1];
            if(isRightHalf){
               left = mid + 1;
           }else{
                right = mid;
            }
        }
        return nums[left];
    }
}