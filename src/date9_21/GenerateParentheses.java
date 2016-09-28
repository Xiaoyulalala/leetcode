package date9_21;

import java.util.*;

/**
 * Created by I334189 on 9/21/2016.
 */
public class GenerateParentheses {
     public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList();
        if(n<=0)
            return result;
        helper(result, "", n, n);
        return result;  
    }

    private void helper(ArrayList<String> result, String temp, int left, int right){
        if(left==0 && right==0){
            result.add(temp);
            return;
        }

        if(left > 0){
            helper(result, temp + "(", left-1, right);
        }
        if(right > 0 && right > left){
            helper(result, temp + ")", left, right-1);
        }

    }

    public static void main(String[] args){
        GenerateParentheses generateParentheses = new GenerateParentheses();
        for(int i = 0;i < generateParentheses.generateParenthesis(3).size();i++){
            System.out.println(generateParentheses.generateParenthesis(3).get(i));
        }
    }
}
