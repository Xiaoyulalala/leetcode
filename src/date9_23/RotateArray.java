package date9_23;

/**
 * Created by I334189 on 9/27/2016.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int i = 0;
        int j = k - 1;
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        int l = k;
        int m = nums.length-1;
        while(l <= m){
            int temp = nums[l];
            nums[l] = nums[m];
            nums[m] = temp;
            l++;
            m--;
        }
        int x = 0;
        int y = nums.length-1;
        while(x <= y){
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
            x++;
            y--;
        }
    }

    public static void main(String[] args){
        int nums[] = {1,2,3,4,5};
        RotateArray ra = new RotateArray();
        ra.rotate(nums, 3);
        for(int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
