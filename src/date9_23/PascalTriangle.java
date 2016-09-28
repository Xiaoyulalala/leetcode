package date9_23;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by I334189 on 9/28/2016.
 */
public class PascalTriangle {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (rowIndex < 0)
            return result;
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }
        return result;
    }

    public List<List<Integer>> getRowii(int rowIndex){
        List<List<Integer>> lists = new ArrayList<>();

        for(int i = 0;i <= rowIndex;i++){
            lists.add(getRow(i));
        }
        return lists;
    }
}
