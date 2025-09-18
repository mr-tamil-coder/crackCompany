class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length,left=0,right=n-1;
            while(left<=right){
            int mid = left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }else if(nums[left] <= nums[mid]){
                //left sorted
                if(target >= nums[left] && target < nums[mid] ){
                    right = mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                //right sort
                if(nums[mid] < target && nums[right] >= target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}