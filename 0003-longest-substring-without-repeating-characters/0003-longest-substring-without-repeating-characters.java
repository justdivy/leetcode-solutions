class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; // ASCII
        Arrays.fill(lastIndex, -1);

        int maxLength = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            if (lastIndex[ch] >= start) {
                start = lastIndex[ch] + 1;
            }

            lastIndex[ch] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}