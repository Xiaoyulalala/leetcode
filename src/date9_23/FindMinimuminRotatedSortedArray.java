package date9_23;

/**
 * Created by I334189 on 9/27/2016.
 */
public class FindMinimuminRotatedSortedArray {

    public int findMin(int[] nums) {
        return binarySearch(nums, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int i, int j){
        if (i >= j)
            return nums[j];
        int mid = (i + j) / 2;
        if (nums[mid] > nums[j])
            return binarySearch(nums, mid + 1, j);
        else if (nums[mid] < nums[j])
            return binarySearch(nums, i, mid);
        else
            return Math.min(binarySearch(nums, mid + 1, j), binarySearch(nums, i, mid));
    }

    public static void main(String[] args){
        FindMinimuminRotatedSortedArray fmrsa = new FindMinimuminRotatedSortedArray();
        int nums[] = { 0, 1, 2};
        System.out.println(fmrsa.findMin(nums));
    }
}
