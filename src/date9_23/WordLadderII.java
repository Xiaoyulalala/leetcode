package date9_23;

import java.util.*;

/**
 * Created by I334189 on 9/27/2016.
 */
public class WordLadderII {

    int min = Integer.MAX_VALUE;
    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        List<List<String>> list = new ArrayList<>();
        List<String> line = new ArrayList<>();
        line.add(beginWord);
        helper(list, line, beginWord, endWord, wordList);
        return list;
    }

    public void helper(List<List<String>> list,List<String> line,String currWord,String endWord, Set<String> wordList){
        if(compareString(currWord, endWord)){
            if(line.size()<=min){
                min = line.size();
                line.add(endWord);
                list.add(new ArrayList<String>(line));
            }
            line.remove(endWord);
            return;
        }
        boolean flag = false;
        for(String word : wordList){
            if(compareString(currWord, word)){
                if(!isShow(word, line)){
                    flag = true;
                    line.add(word);
                    helper(list, line, word, endWord,wordList);
                    line.remove(line.size()-1);
                }
            }
        }
        if(!flag){
            line.remove(line.size()-1);
        }
    }

    private boolean isShow(String word, List<String> list){
        for(int i = 0;i < list.size();i++){
            if(word.equals(list.get(i)))
                return true;
        }
        return false;
    }

    private boolean compareString(String preWord, String currWord){
        boolean isNext = false;
        int count = 0;
        if(preWord.length()!=currWord.length())
            return isNext;
        for(int i = 0;i < preWord.length();i++){
            if(preWord.charAt(i)!=currWord.charAt(i)){
                count++;
            }
        }
        if(count==1)
            isNext = true;
        return isNext;
    }

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("hot");
//        list.add("ttt");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        Set<String> wordList = new HashSet<>(list);
        WordLadderII wlii = new WordLadderII();
        List<List<String>> lists = wlii.findLadders("hit", "cog", wordList);
        System.out.print(lists.size());
        for (int i = 0;i < lists.size();i++){
            for(String word : lists.get(i)){
                System.out.print(word+"--");
            }
            System.out.println();
        }
    }

}
