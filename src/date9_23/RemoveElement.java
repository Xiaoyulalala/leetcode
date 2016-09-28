package date9_23;

/**
 * Created by I334189 on 9/23/2016.
 */
public class RemoveElement {
    public int remove(int[] nums, int val){
        if(nums==null) return 0;
        int i = 0;
        int j = 0;
        for(;i < nums.length;i++){
            if(nums[i]!=val){
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int nums[] = {3,2,2,3};
        int val = 3;
        RemoveElement removeE = new RemoveElement();
        System.out.println(removeE.remove(nums, val));
    }
}
