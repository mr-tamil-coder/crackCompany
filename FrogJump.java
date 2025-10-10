// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        
        int dp[] = new int[height.length];
        return frogHelper(height,dp);
    }
    private int frogHelper(int[] height,int[] dp){
        int n = height.length;
        dp[0] = 0;
        for(int i=1;i<n;i++){
            // System.out.println(Arrays.toString(dp));
            dp[i] = Integer.MAX_VALUE;
            int oneStep = dp[i-1]+ Math.abs(height[i] - height[i-1]);
            int twoStep = Integer.MAX_VALUE;
            if(i > 1)
             twoStep = dp[i-2]+ Math.abs(height[i] - height[i-2]);
            dp[i] = Math.min(oneStep,twoStep);
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n-1];
    }
}




// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int n = height.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        return frogHelper(height,n-1,map);
        
    }
    private int frogHelper(int[] height,int index,HashMap<Integer,Integer> map){
        
        if(index == 0) return 0;
        if(map.containsKey(index))
         return map.get(index);
        int left = frogHelper(height,index-1,map) + Math.abs(height[index] - height[index - 1]);
        int right = Integer.MAX_VALUE;
        if(index > 1)
            right = frogHelper(height,index-2,map) + Math.abs(height[index] - height[index - 2]);
        int result = Math.min(left,right);
        map.put(index,result);
        return result;
    }
}