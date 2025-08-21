class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set1 = new HashSet<>();
        int l = 0; 
        int maxl = 0;

        for (int r = 0; r < s.length(); r++) { 
            while (set1.contains(s.charAt(r))) {
                set1.remove(s.charAt(l));
                l++;
            }
            set1.add(s.charAt(r));
            maxl = Math.max(maxl, r - l + 1);
        }

        return maxl;
    }
}
