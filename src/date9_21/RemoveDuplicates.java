package date9_21;

/**
 * Created by xiaoyu on 9/21/2016.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
//        int i = 1;
//        int count = 0;
//        while(i < nums.length){
//            if(nums[i]==nums[i-1]){
////                nums[i] = nums[i+1];
//
//                count++;
//            }
//                i++;
//
//        }
//
//        return nums.length-count;

        int j = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        for(int m = 0;m < nums.length;m++){
            System.out.println(nums[m]);
        }
        return j + 1;
    }

    public static void main(String[] args){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int nums[] = {1,1,2,3,4,5,6,6,7,7,};
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }

}
