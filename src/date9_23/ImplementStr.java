package date9_23;

/**
 * Created by I334189 on 9/23/2016.
 */
public class ImplementStr {
    public int strStr(String haystack, String needle){
        int i = 0;
        int j = 0;
        if(haystack == null || needle == null)
            return -1;

        boolean isExist = false;
        while(i<haystack.length()){
            if(j==needle.length()){
                if(j!=0)
                    isExist = true;
                break;
            }else{

            }
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }

        }
        if(isExist){
            return i - needle.length();
        }else{
            if(i!=0) {
                return -1;
            }else{
                return 0;
            }
        }

    }

    public static void main(String[] args){
        String haystack = "a";
        String needle = "";
        ImplementStr implementStr = new ImplementStr();
        System.out.println(implementStr.strStr(haystack, needle));
    }
}
