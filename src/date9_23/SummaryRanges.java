package date9_23;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by I334189 on 9/26/2016.
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
       int start = 0;
       int end   = 1;
       String range = "";
       ArrayList<String> list = new ArrayList();
       if(nums.length==0){
           list.add(String.valueOf(nums[0]));
       }
       while(end < nums.length){

           if(nums[end-1] == (nums[end]-1)){

           }else if(start==end-1){
               range = String.valueOf(nums[start]);
               list.add(range);
               start = end + 1;
               range = "";
           }
           else{
               range = nums[start] + "->" + nums[end-1];
               list.add(range);
               start = end;
               range = "";
           }
           end++;
       }
       for(int i = 0;i < list.size();i++){
           System.out.println(list.get(i));
       }
       return list;
    }

    public static void main(String[] args){
        SummaryRanges summaryRanges = new SummaryRanges();
        int nums[] = {0,1,2,4,5,7,8,9};
        summaryRanges.summaryRanges(nums);
    }
}
