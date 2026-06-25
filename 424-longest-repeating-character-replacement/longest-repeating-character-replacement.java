class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int max_length = 0;
        int max_freq = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            max_freq = Math.max(max_freq, ++count[s.charAt(right) - 'A']);
            
            while ((right - left + 1) - max_freq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            
            max_length = Math.max(max_length, right - left + 1);
        }
        
        return max_length;
    }
}

