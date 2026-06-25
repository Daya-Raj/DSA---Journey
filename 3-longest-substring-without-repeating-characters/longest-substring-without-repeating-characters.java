class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = s.length();
        int left = 0;
        Set<Character> st = new HashSet<>();
        for(int right = 0;right<n;right++){
        if(!st.contains(s.charAt(right))){
                st.add(s.charAt(right));
                max = Math.max(max,right-left+1);

            }
            else{
                while(st.contains(s.charAt(right))){
                    st.remove(s.charAt(left));
                    left++;
                }
                st.add(s.charAt(right));
            }
        }
         return max;
}
    }
