package date9_23;

/**
 * Created by I334189 on 9/28/2016.
 */
public class Subsets {

     public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        if(nums == null || nums.length<=0){
            return null;
        }
        
        helper(nums, 0, currList, lists);

        return lists;
    }
//fuck u
    public void helper(int[] nums, int index,List<Integer> currList, List<List<Integer>> lists){
        lists.add(currList);


        for(int i = index + 1;i < nums.length;i++){
            if(nums[i] != nums[i-1]){
                currList.add(nums[i]);
                helper(nums, index++, currList, lists);
                currList.remove(currList.size()-1);
            }
        }
    }
}
