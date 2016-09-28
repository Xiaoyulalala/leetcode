package date9_19;

import java.util.Collections;

/**
 * Created by I334189 on 9/19/2016.
 */
public class CombinationSum {


    public int combinationSum4(int[] nums, int target){
        int[] dp= new int[target+1];
        dp[0] = 1;
        for(int i = 1; i <= target;i++){
            for(int num:nums){
                if(i >= num) dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }



    public static void main(String[] args){
        CombinationSum combinationSum = new CombinationSum();
        int[] nums = {4,2,3,1};
        int target = 40;
        System.out.print(combinationSum.combinationSum4(nums, target));

    }
}
