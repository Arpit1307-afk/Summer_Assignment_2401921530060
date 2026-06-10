class Solution {
    public int firstUniqChar(String s) {
        // int n=s.length();
        // int count=0;
        // HashSet<Character> aaa=new HashSet<>();
        // for(int i=0;i<n;i++)
        // {
        //     count=1;
        //     char c=s.charAt(i);
        //     if(aaa.contains(c))  continue;
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(c==s.charAt(j)) count+=1;
        //     }
        //     if(count==1) return i;
        //     aaa.add(c);
        // }
        // return -1;
        int[] frequency = new int[26]; 

        for (char c : s.toCharArray()) {
            frequency[c - 'a']++; // Map 'a' to 0, 'b' to 1, ..., 'z' to 25
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index of the first unique character
            }
        }
        // If no unique character is found, return -1
        return -1;
    }
}
