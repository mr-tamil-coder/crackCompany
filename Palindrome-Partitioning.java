class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        partitionString(0,s,new ArrayList<>(),result);
        return result;
    }
    private void partitionString(int start,String s,List<String> curr,List<List<String>> result){
        if(s.length() == start){
            result.add(new ArrayList<>(curr));
            return ;
        }
        for(int end = start;end<s.length();end++){
            String substring = s.substring(start,end+1);
            if(isPalindrome(substring)){
                curr.add(substring);
                partitionString(end+1,s,curr,result);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s){
        int left = 0,right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}