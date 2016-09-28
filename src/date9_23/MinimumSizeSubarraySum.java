package date9_23;

/**
 * Created by I334189 on 9/27/2016.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int j = 0, i = 0;
        int sum =0;
        int ans = Integer.MAX_VALUE;
        for(i = 0; i < nums.length; i++) {
            while(j < nums.length && sum < s ) {
                sum += nums[j];
                j ++;
            }
            if(sum >=s)
                ans = Math.min(ans, j - i  );
            sum -= nums[i];
        }
        if(ans == Integer.MAX_VALUE)
            ans = 0;
        return ans;
    }

  

    public static void main(String[] args){
        MinimumSizeSubarraySum msss = new MinimumSizeSubarraySum();
        int[] nums = {1,2,3,4,5};
        System.out.print(msss.minSubArrayLen(11, nums));
    }
}
