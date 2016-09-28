package date9_23;

/**
 * Created by I334189 on 9/26/2016.
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int ret[] = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            //<=i-1
            int total = 1;
            for(int k = 0;k < i-1;k++){
                total = total*nums[k];
            }
            for(int m = i+1;m < nums.length;m++){
                total = total*nums[m];
            }
            ret[i] = total;
        }
        return ret;
    }
    public static void main(String[] args){
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {};
        int[] set = productExceptSelf.productExceptSelf(nums);
    }
}
