class Solution {
    public int arraySign(int[] nums) {
        int result  = 1;
        for(int i : nums){
            if(i < 0) result *= -1;
            else if(i == 0){
                return 0;
            }
        }
        return result;
    }
}