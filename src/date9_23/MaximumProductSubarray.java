package date9_23;

/**
 * Created by I334189 on 9/27/2016.
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        max[0] = nums[0];
        min[0] = nums[0];
        int result = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i]>0){
                max[i] = Math.max(nums[i],max[i-1]*nums[i]);
                min[i] = Math.min(nums[i],min[i-1]*nums[i]);
            }else{
                max[i] = Math.max(nums[i],min[i-1]*nums[i]);
                min[i] = Math.min(nums[i],max[i-1]*nums[i]);
            }
            result = Math.max(result, max[i]);
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {2,-2,-3,4};
        MaximumProductSubarray mps = new MaximumProductSubarray();
        System.out.println(mps.maxProduct(nums));
    }
}
