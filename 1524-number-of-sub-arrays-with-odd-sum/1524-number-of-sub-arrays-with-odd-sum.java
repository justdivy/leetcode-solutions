
class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        long even = 1, odd = 0, ans = 0;
        int prefix = 0;

        for (int num : arr) {
            prefix += num;

            if (prefix % 2 == 1) {
                ans += even;
                odd++;
            } else {
                ans += odd;
                even++;
            }

            ans %= mod;
        }

        return (int) ans;
    }
}
