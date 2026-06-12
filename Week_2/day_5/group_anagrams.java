import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //Correct one(here we will use (fre converted to string) as key as anagrams produce same fre) (18ms)

        // List<List<String>> ans=new ArrayList<>();
        // Map<String,List<String>> map=new HashMap<>();
        // for(String s:strs){
        //     int[] fre=new int[26];
        //     for(char c:s.toCharArray()) fre[c-'a']++;
        //     //convert array to string
        //     String key=Arrays.toString(fre);
        //     map.putIfAbsent(key,new ArrayList<>());
        //     map.get(key).add(s);
        // }
        // return new ArrayList<>(map.values());

        //(7ms)
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] key=s.toCharArray();
            Arrays.sort(key);
            String x=new String(key);   //Arrays.toString(key) takes extra time
            map.putIfAbsent(x,new ArrayList<>());
            map.get(x).add(s);
        }
        return new ArrayList<>(map.values());
    }
}