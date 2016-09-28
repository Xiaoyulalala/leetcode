package date9_23;

/**
 * Created by I334189 on 9/26/2016.
 */
public class MissingNumber {
    
    public int missingNumber(int[] nums) {
         int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
    
        int n=nums.length;
        return n*(n+1)/2-sum;
    }
}
