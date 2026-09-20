class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        for(int i=0; i<s.length(); i++){
            total += (123 - s.charAt(i)) * (i + 1);
        }
        return total;
    }
}