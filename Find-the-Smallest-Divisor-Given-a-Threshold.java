class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = findMax(nums);
        int ans = 0;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (isPossible(mid,nums, threshold)) {
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    private boolean isPossible(int mid,int[] nums, int threshold) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            count += Math.ceil((double) nums[j] / mid);
        }
        if (count <= threshold) {
            return true;
        }
        return false;
    }

    // private int findMin(int nums[]){
    //     int min = Integer.MAX_VALUE;
    //     for(int num : nums){
    //         if(num < min){
    //             min = num;
    //         }
    //     }
    //     return min;
    // }
    private int findMax(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}