package date9_23;

/**
 * Created by I334189 on 9/27/2016.
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0] > nums[1])
            return 0;
        if(nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }
        for(int i = 1;i < nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        FindPeakElement fpe = new FindPeakElement();
        int[] nums = {1,2,3,1};
        System.out.println(fpe.findPeakElement(nums));
    }
    
}
