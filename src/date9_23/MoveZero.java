package date9_23;

/**
 * Created by I334189 on 9/26/2016.
 */
public class MoveZero {
    public void moveZeroes(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            for(int j = i;j < nums.length;j++){
                if(nums[i]==0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        MoveZero moveZero = new MoveZero();
        int nums[] = {0, 1, 0, 3, 12};
        moveZero.moveZeroes(nums);
        for(int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
