public class ReverseInteger2 {
       public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        
        // Process every 2k characters
        for (int start = 0; start < n; start += 2 * k) {
            // Determine the end of current k-length segment to reverse
            int end = Math.min(start + k - 1, n - 1);
            
            // Reverse characters from start to end using two pointers
            reverseRange(chars, start, end);
        }
        
        return new String(chars);
    }
    
    // Helper method to reverse characters in range [left, right]
    private void reverseRange(char[] chars, int left, int right) {
        while (left < right) {
            // Swap characters at left and right positions
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
    }
}
