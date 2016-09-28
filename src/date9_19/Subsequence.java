package date9_19;

/**
 * Created by I334189 on 9/19/2016.
 */
public class Subsequence {

    public boolean isSubsequence(String s,String t){
        int i = 0;
        int j = 0;
        while (i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i==s.length()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Subsequence subsequence = new Subsequence();
        String s = "axc";
        String t = "ahbgdc";
        System.out.print(subsequence.isSubsequence(s,t));
    }
}
