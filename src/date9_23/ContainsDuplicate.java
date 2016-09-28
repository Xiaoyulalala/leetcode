package date9_23;

import java.util.HashMap;

/**
 * Created by I334189 on 9/26/2016.
 */
public class ContainsDuplicate {

    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    if(Math.abs(i-j) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                int pre = map.get(nums[i]);
                if(Math.abs(pre-i) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1,2,3,5,7,3};
        System.out.print(cd.containsNearbyDuplicate1(nums,3));
    }

}
