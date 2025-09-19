class Solution {
    public int mySqrt(int x) {
        long low = 1,high = x;
        long ans=0;
        while(low <= high){
            long mid = low + (high -low)/2;
            if(mid <= x/mid){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (int)ans;
    }
}