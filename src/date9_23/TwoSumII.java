package date9_23;

/**
 * Created by I334189 on 9/27/2016.
 */
public class TwoSumII {

    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int total = 0;
        boolean isExist = false;
        while(i <= j){
            total = nums[i] + nums[j];
            if(total < target){
                i++;
            }else if(total > target){
                j--;
            }else{
                isExist = true;
                break;
            }
        }
        int[] ret = new int[2];
        if(isExist){
            ret[0] = i + 1;
            ret[1] = j + 1;
        }else{
            
        }
        return ret;
    }

    public static void main(String[] args){
        int[] nums = {2,3,4};
        int target = 6;
        TwoSumII ts = new TwoSumII();

        System.out.println(ts.twoSum(nums, target)[0]);
    }

}
