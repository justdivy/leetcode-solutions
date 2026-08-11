class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length, i = 0;
        while (i + 1 < n && nums[i + 1] == nums[i] + 1) i++;

        int sum = 0;
        for (int j = 0; j <= i; j++) sum += nums[j];

        boolean[] present = new boolean[1001]; // nums[i] <= 100, sum can go a bit higher but safe bound
        for (int x : nums) if (x < 1001) present[x] = true;

        while (sum < 1001 && present[sum]) sum++;
        return sum;
    }
}