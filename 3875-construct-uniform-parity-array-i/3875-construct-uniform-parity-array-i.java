class Solution {
    public boolean uniformArray(int[] nums1) {
       int oddCount = 0;
       int evenCount = 0;

       for(int num : nums1){
        if(num % 2 == 1){
            oddCount++;
        }else{
            evenCount++;
        }
       }
       if(oddCount == 0 || evenCount == 0){
        return true;
       }
       return true;
    }
}