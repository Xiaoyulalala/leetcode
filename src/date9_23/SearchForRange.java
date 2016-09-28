package date9_23;

/**
 * Created by I334189 on 9/23/2016.
 */
public class SearchForRange {
    public int[] searchRange(int[] nums, int target) {
       int from = 0;
       int to = nums.length-1;
       int index = -1;

       while(from<=to){
           int mid = (from+to)/2;
           if(nums[mid] == target){
               index = mid;
           }
           if(nums[mid] > target){
               to = mid - 1;
           }
           if(nums[mid] < target){
               from = mid + 1;
           }
       }

       while(nums[from]!=target){
           from++;
       }

       while(nums[to]!=target){
           to--;
       }
       if(index != -1){
           int ret[] = {from, to};
           return ret;
       }else{
           int ret1[] = {-1, -1};
           return ret1;
       }    
    }

    public static void main(String[] args){
        SearchForRange search = new SearchForRange();
        int a[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(search.searchRange(a, target));
    }
}
