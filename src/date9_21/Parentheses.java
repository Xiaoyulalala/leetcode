package date9_21;

import java.util.Stack;

/**
 * Created by I334189 on 9/21/2016.
 */
public class Parentheses {

    public boolean isValid(String s) {
        Stack stack = new Stack();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if(stack.size()!=0){
                    char top = (char)stack.peek();
                    switch (s.charAt(i)){
                        case ')':
                            if(top!='('){
                                return false;
                            }else{
                                stack.pop();
                            }
                            break;
                        case ']':
                            if(top!='['){
                                return false;
                            }else {
                                stack.pop();
                            }
                            break;
                        case '}':
                            if(top!='{'){
                                return false;
                            }else{
                                stack.pop();
                            }
                            break;
                        default:
                            break;
                    }
                }else{
                    return false;
                }


            }else {
                return false;
            }
        }
        if(stack.size()!=0)
            return false;
        return true;
    }

    public static void main(String[] args){
        Parentheses parentheses = new Parentheses();
        String s = "()()([)(])";
        System.out.println(parentheses.isValid(s));
    }
    
}
