package date9_23;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by I334189 on 9/26/2016.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();

        helper(retList, list, k, n, 1);
        for(int i = 0;i < retList.size();i++){
            System.out.println(retList.get(i));
        }
        return retList;
    }

    public void helper(List<List<Integer>> retList,List<Integer> list, int k, int sum,int start){
        if(sum < 0){
            return;
        }
        if(k==list.size() && sum==0){
            //add
            retList.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = start;i <= 9;i++){
            //add
            list.add(i);
            helper(retList, list, k, sum-i, i+1);
            //remove
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args){
        CombinationSum cs = new CombinationSum();
        cs.combinationSum3(3,7);
    }
}
