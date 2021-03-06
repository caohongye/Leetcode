package e_7July;

public class MaxSubArray2 {
    public int maxSubArray(int[] nums) {
        //分治思想
        int[] dp = new int[nums.length];
        int res = nums[0];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(dp[i - 1]+nums[i], nums[i]);
            res = Math.max(dp[i], res);
        }
        return res;
    }
}
