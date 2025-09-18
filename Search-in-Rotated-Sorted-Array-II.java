class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0,right = nums.length-1,mid=0;
        while(left <= right){
            mid = left + (right - left)/2;
            if(nums[mid] == target) return true;
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
                continue;
            }
            else if(nums[left] <= nums[mid]){
                // left half is sorted
                if(nums[left] <= target && nums[mid] > target){
                    right = mid - 1;
                }else{
                    left = mid+1;
                }
            }else{
                //right half is sorted
                if(nums[mid] < target && nums[right] >= target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return false;

    }
}