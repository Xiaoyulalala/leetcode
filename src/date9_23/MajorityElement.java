package date9_23;

import java.util.HashMap;

/**
 * Created by I334189 on 9/27/2016.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
       for(int i = 0;i < nums.length;i++){
           if(map.containsKey(nums[i])){
               map.put(nums[i],map.get(nums[i])+1);
           }else{
               map.put(nums[i], 1);
           }
           if(map.get(nums[i]) > nums.length/2)
               return nums[i];
       }
       return -1;
    }

    public int majorityElement1(int[] nums){
        int candidate = 0;
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if(candidate == nums[i]){
                count++;
            }else if(count == 0){
                candidate = nums[i];
                count = 1;
            }else{
            }
            count--;
        }
        return candidate;
    }

    public static void main(String[] args){
        int[] nums = {1};
        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement1(nums));
    }

}
