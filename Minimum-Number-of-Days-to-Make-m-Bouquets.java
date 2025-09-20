class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       if((m*k) > bloomDay.length) return -1;
       int start = findMin(bloomDay);
       int end = findMax(bloomDay);
       int ans = -1;
       while(start <= end){
         int mid = start + (end- start)/2;
         if(isPossibleToBloomDay(mid,bloomDay,m,k)){
            ans=mid;
            end = mid - 1;
         }else{
            start = mid + 1;
         }
       }
       return ans;
    }
    private boolean isPossibleToBloomDay(int mid,int[] bloomDay,int m,int k){
          int count = 0,formed = 0;
          for(int j=0;j<bloomDay.length;j++){
            if(bloomDay[j] <= mid){
                count++;
            }else{
                formed += count / k;
                count = 0;
            }
          }
          formed += count / k;     
          if(formed >= m) return true;
          return false;
    }

    private int findMin(int[] bloomDay){
        int min = Integer.MAX_VALUE;
        for(int val : bloomDay){
            if(val < min){
                min = val;
            }
        }
        return min;
    }
    private int findMax(int[] bloomDay){
        int max = Integer.MIN_VALUE;
        for(int val : bloomDay){
            if(val > max){
                max = val;
            }
        }
        return max;
    }
}