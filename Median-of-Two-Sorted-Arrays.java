class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i=0,j=0,k=0;
        int result[] = new int[m+n];
         while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[k++] = nums1[i++];
            }else{
                result[k++] = nums2[j++];
            }
        }

        while(i<m){
            result[k++] = nums1[i++];
        }
        while(j<n){
            result[k++] = nums2[j++];
        }

         int mid = (m+n)/2;
        if((m+n)%2==0){
            return (float)(result[mid] + result[mid-1])/2.0;
        }
        return result[mid];
    }
}