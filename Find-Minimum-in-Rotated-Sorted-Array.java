class Solution {
    public int findMin(int[] nums) {
        int left = 0 ,right = nums.length-1,mid = 0,min=Integer.MAX_VALUE;
        while(left <= right){
            mid = (left)+(right - left)/2;
            if(nums[left] <= nums[mid]){
                min=Math.min(min,nums[left]);
                left=mid+1;
            }else{
                min=Math.min(min,nums[left]);
                right = mid;
            }
        }
        return min;
    }
}